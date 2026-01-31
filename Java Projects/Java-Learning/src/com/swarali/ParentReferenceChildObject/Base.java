package com.swarali.ParentReferenceChildObject;

public class Base {

    String baseVar;
    int a= 10;

    public Base(String str, int a){
        this.baseVar= str;
        this.a= a;
    }

    public void m1(){
        System.out.println("base class method- m1");
    }
}
