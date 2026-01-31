package com.swarali.staticMethod;

public class Derived {

     int x= 78;

//    @Override
    public void printLine(){ // this is not overriding. Because static method in base class cannot be overridden
        System.out.println("non-static printLine() in Derived class");

    }
}
