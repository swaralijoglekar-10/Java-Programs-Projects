package com.swarali.innerClasses;

class A {

    //1. Non-static inner class/ regular inner class
    class B{
     void display(){
         System.out.println("Hello from non-static method in inner class");
     }
    }


}

public class InnerClasses{
    public static void main(String[] args) {

        //1. Non-static inner class/regular inner class
        A a = new A();
        A.B b = a.new B();
        b.display();



    }
}
