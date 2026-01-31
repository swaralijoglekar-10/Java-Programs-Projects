package com.swarali.OOP_GroupStudy;

public class Calculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getMultiplicationResult(){
        return this.firstNumber*this.secondNumber;
    }
    public double getDivisionResult(){
        if(this.secondNumber==0) return 0;
        return this.firstNumber/this.secondNumber;
    }

    public static void main(String[] args) {
        Calculator calculator= new Calculator();
        calculator.setFirstNumber(20.5);
        calculator.setSecondNumber(5.7);
        System.out.println(calculator.getMultiplicationResult()+" "+
                calculator.getDivisionResult());

    }

}
