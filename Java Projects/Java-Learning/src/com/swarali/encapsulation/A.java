package com.swarali.encapsulation;

public class A {
    Base b2= new Base();

    public void aMethod(String[] args) {
        System.out.println(b2.x);

        //How could x be accessed? x is protected
    }
}
