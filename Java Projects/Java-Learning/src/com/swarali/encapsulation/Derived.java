package com.swarali.encapsulation;

public class Derived extends Base{
Base b4= new Base();

    public void derivedMethod1(){
        System.out.println(b4.x);
    }

    public static void main(String[] args) {
        Base b1= new Base();
        b1.baseMethod1();
        System.out.println(b1.x);
        Derived d1= new Derived();
        d1.derivedMethod1();
    }
}
