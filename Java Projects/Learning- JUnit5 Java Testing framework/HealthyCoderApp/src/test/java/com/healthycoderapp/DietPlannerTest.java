package com.healthycoderapp;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DietPlannerTest {

    private DietPlanner dietPlanner;

// Before each test new DietPlanner instance will be created

    @BeforeEach
    void setup() {
        this.dietPlanner = new DietPlanner(20, 30, 50);
    }

    @AfterEach
    void afterEach() {
        System.out.println("A unit test was finished");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all unit tests");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all unit tests");
    }

    @Test
    void should_ReturnCorrectDietlPlan_When_CorrectCoder() {
        //given
        Coder coder = new Coder(1.82, 75, 26, Gender.MALE);

        DietPlan expectedDietPlan = new DietPlan(2202, 110, 73, 275);

        //when
        DietPlan actualDietPlan = dietPlanner.calculateDiet(coder);

        //then
        // WRONG:- assertEquals(expectedDietPlan, actualDietPlan);  addresses will be compared

        assertAll(
                () -> assertEquals(expectedDietPlan.getCalories(), actualDietPlan.getCalories()),
                () -> assertEquals(expectedDietPlan.getFat(), actualDietPlan.getFat()),
                () -> assertEquals(expectedDietPlan.getCarbohydrate(), actualDietPlan.getCarbohydrate()),
                () -> assertEquals(expectedDietPlan.getProtein(), actualDietPlan.getProtein())
        );

    }


    // The repetition of test is needed if we're generating random values
    // inside the test and the test needs to run for those values.
    // @RepeatedTest(10) //to repeat the test 10 times

    // @RepeatedTest(value= 10, name= RepeatedTest.LONG_DISPLAY_NAME)
    // method name is seen due to long display name

}