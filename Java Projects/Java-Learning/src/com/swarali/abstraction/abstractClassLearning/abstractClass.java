package com.swarali.abstraction.abstractClassLearning;

abstract class abstractClass {

    abstractClass(){
        System.out.println("constructor in abstract class");
    }
    public void myMethod(){
        System.out.println("--in abstract class--");
    }

    static void myMethod3(){

    }

    abstract public void myMethod2();
}
