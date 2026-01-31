package com.swarali.ParentReferenceChildObject;

public class Test {
    public static void main(String[] args) {

        Base b1= new Derived("Schaeffler Germany", 100, "demo1");
        System.out.println("Base class and derived class same variable name:"
                +" Base class variable's value is printed"
                +b1.a);

        b1.m1();

        Test t1= new Test();
        Base b2 =  t1.method();
        //Although I could return Derived class's reference from method() method,
        // I'll have to get the response in type of class same as method()'s type
    }

    public Base method(){
      System.out.println("Hello from Main!");
//        Base b1= new Base("Schaeffler Germany Herzogenaurach", 1000);
//        return b1;
        Derived d1= new Derived("Schaeffler India", 850, "demo1");
        return d1;
    }
}
