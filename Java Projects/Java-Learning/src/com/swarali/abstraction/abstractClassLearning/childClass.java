package com.swarali.abstraction.abstractClassLearning;

import com.swarali.encapsulation.Base;

public class childClass extends abstractClass {
Base b1 = new Base();
    @Override
    public void myMethod2() {
        System.out.println("implemented method in child class which is abstract in abstract class");
        //error- System.out.println(b1.x); x has protected access in Base class(com.swarali.encapsulation.Base;)
    }

    public static void main(String[] args) {
        abstractClass ab= new childClass();
        ab.myMethod();
        ab.myMethod2();
    }
}
