package com.swarali.ParentReferenceChildObject;

public class Derived extends Base{

    String derivedVar;
    int a= 40;

    String demo;

    public Derived(String str, int a, String demo) {
        super(str, a);
    }

    public void m1(){
        System.out.println("derived class method- m1");
    }
    public void m2(){
        System.out.println("derived class method- m2");
    }
}
