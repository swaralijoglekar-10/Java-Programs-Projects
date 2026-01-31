package com.swarali.exceptionHandling.checkedException;

import java.io.FileNotFoundException;
import java.io.IOException;

class A{
    int x;
    public A() throws IOException{
        System.out.println("class A--default constructor");
    }
    public A(int x){
        this.x = x;
    }

    public void m1() throws IOException{

    }

    public void m2() throws ClassNotFoundException{

    }
}

class B extends A{
    int y;
    public B() throws Exception{  //throws FileNotFoundException would result in error

    }
    public B(int y){
        super(10);
        this.y= y;
    }

    @Override
    public void m1() throws FileNotFoundException {
        /*Error- (Don't use throws for a method if it's not used in parent class's method)throws IOException */
    }
}
public class throwsInOverridding {

    public static void main(String[] args) throws IOException {

            A a1= new A();
            a1.m1();
          //  a1.m2();

        A  a2= new A(45);
        System.out.println(a2.x);

    }

}
