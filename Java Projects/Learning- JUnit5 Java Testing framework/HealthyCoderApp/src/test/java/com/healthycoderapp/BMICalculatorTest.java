package com.healthycoderapp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.time.Duration;
import java.util.List;
import java.util.ArrayList;

class BMICalculatorTest {

    private String environment= "prod";

    @ParameterizedTest(name= "weight={0}, height={1}")
    @CsvFileSource(resources = "/diet-recommended-input-data.csv", numLinesToSkip = 1)
    void should_Return_True_WhenDietRecommended_NewWay_3(Double coderWeight, Double coderHeight){

        //given
        var weight = coderWeight;
        var height= coderHeight;

        //when
        var result= BMICalculator.isDietRecommended(weight, height);

        //then
        assertTrue(result);
    }


    @ParameterizedTest(name= "weight={0}, height={1}")
    @CsvSource(value={"89.0,1.72", "95.0 ,1.75"}) //comma separated values of weight and height
    void should_Return_True_WhenDietRecommended_NewWay_2(Double coderWeight, Double coderHeight){

        //given
        var weight = coderWeight;
        var height= coderHeight;

        //when
        var result= BMICalculator.isDietRecommended(weight, height);

        //then
        assertTrue(result);
    }

    @DisplayName("weight values in @ValueSource")
    @ParameterizedTest
    @ValueSource(doubles= {89.0, 95.0, 110.0}) //weight values
    void should_Return_True_WhenDietRecommended_NewWay_1(Double coderWeight){

        //given
        var weight = coderWeight;
        var height= 1.72;

        //when
        var result= BMICalculator.isDietRecommended(weight, height);

        //then
        assertTrue(result);
    }

    @DisabledOnOs(OS.MAC) // this test will be disabled on MAC operating system
    @Test
    void should_Return_True_WhenDietRecommended_OldWay(){   // use intuitive name instead of test()

        //given
        var weight1= 89.0; //kg
        var height1= 1.5;   //meter
        var weight2= 59.0;
        var height2= 1.7;

        //when
        var result1= BMICalculator.isDietRecommended(weight1, height1);
        var result2= BMICalculator.isDietRecommended(weight2, height2);

        //then
        assertTrue(result1);
        assertFalse(result2);

        // assertTrue(BMICalculator.isDietRecommended(90, 1.64)); :-if this test fails, then diet is not recommended (means we get false which we're comparing with true)
        // assertTrue- we expect true
        // assertFalse - we expect false
    }


    @Test
    void should_ThrowArithmeticException_When_HeightZero(){

        // We want to check whether exception is thrown when height is 0.0

        //given
        var weight1= 58.0;
        var height1= 0.0;
        //when
        // boolean result= BMICalculator.isDietRecommended(weight1, height1);
        // The above line will throw exception and there would be no chance to check assertThrows
        Executable executable= ()-> BMICalculator.isDietRecommended(weight1, height1);

        //then
        assertThrows(ArithmeticException.class, executable);

    }

    @Test
    void shouldReturnCoderWithWorstBMI_WhenCoderListNotEmpty(){

        // method findCoderWithWorstBMI() in BMICalculator.java

        //given
        List<Coder> coders= new ArrayList<>();
        coders.add(new Coder(1.8, 60.0));
        coders.add(new Coder(1.82, 98.0));
        coders.add(new Coder(1.82, 64.0));

        //when
        Coder coderWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);

        //then
//        assertEquals(1.82, coderWorstBMI.getHeight()); //expected, actual
//        assertEquals(98.0, coderWorstBMI.getWeight());

        assertAll(
                ()-> assertEquals(1.82, coderWorstBMI.getHeight()),
                ()-> assertEquals(98.0, coderWorstBMI.getWeight())
        );

        //need of assertAll- if first assert fails, then second assert will not be executed
        // So, in order to know whether the test is failing due to only one assertion or remaining assertions also, use assertAll

    }

    @Test
    void should_ReturnCoderWithWorstBMIIn1Ms_WhenCoderListHas1000Elements(){

        assumeTrue(this.environment.equals("dev"));
        //private String environment
        // if String value is not dev, this test will be ignored.

        //given
        List<Coder> coders= new ArrayList<>();
        for(int i=0; i<1000; i++){
            coders.add(new Coder(1.0+i, 10.0+i));
        }

        //when
        Executable executable = () -> BMICalculator.findCoderWithWorstBMI(coders);

        //then
        assertTimeout(Duration.ofMillis(50), executable); // assertTimeout- only checks the time needed for executable
        // doesn't consider the time to insert 1000 elements

    }


    @Test
    void shouldReturnNull_CoderWithWorstBMI_WhenCoderListEmpty(){

        // method findCoderWithWorstBMI() should return null when list is empty

        //given
        List<Coder> coders = new ArrayList<>();

        //when
        Coder coderWorstBMI= BMICalculator.findCoderWithWorstBMI(coders);

        //then
        assertNull(coderWorstBMI);
    }

    @Test
    void shouldReturnCorrectBMIScore_WhenCoderListNotEmpty(){

        //method getBMIScores()

        //given
        List<Coder> coders= new ArrayList<>();
        coders.add(new Coder(1.80, 60.0));
        coders.add(new Coder(1.82, 98.0));
        coders.add(new Coder(1.82, 64.7));

        double[] expectedBMIScores= {18.52, 29.59, 19.53};

        //when
        double[] actualBMIScores= BMICalculator.getBMIScores(coders);

        //then
        // check expected BMI scores w.r.t. actual BMI scores
       //WRONG:- assertEquals(expectedBMIScores, actualBMIScores);  addresses are compared instead of values
        assertArrayEquals(expectedBMIScores, actualBMIScores);

    }

}