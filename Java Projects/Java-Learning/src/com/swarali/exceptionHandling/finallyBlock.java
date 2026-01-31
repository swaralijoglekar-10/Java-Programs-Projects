package com.swarali.exceptionHandling;

class ABC{

    public int method1(){
        try{
            System.out.println("try--start");
            return 10;
        }
        finally {
            System.out.println("finally--start");
            return 20;
        }
    }

    public int method2(){
        int x = 40;
        try{
            x= 50;
            return x;
        }
        finally {
            x= 67; //this is valid within finally block only.
        }
    }

    public static void main(String[] args) {

        //try and finally both with return statement
        ABC abc= new ABC();
        System.out.println(abc.method1());
        System.out.println(abc.method2());
    }
}

class DEF{
    //try, catch, finally-all with return statements
    public int m1(){
        try{
            int x= 10/0;
            return 10;
        }
        catch(ArithmeticException e){
            return 20;
        }
        finally {
            return 30;
        }
    }

    public static void main(String[] args) {
        DEF def= new DEF();
        System.out.println(def.m1());
    }

}

public class finallyBlock {
    public static void main(String[] args) {
        //Even if there's no catch block to handle exception in try, finally block is executed first
        //and then the exception is thrown.

        // If try and finally both have problematic lines,
        // then exception from finally{ } block is executed.

        System.out.println("main--start");
        try{
            System.out.println("next line is int x= 10/0");
            int x= 10/0;
            System.out.println("try--end");
        }
        finally {
            System.out.println("finally--start");
            String str= args[0];
            System.out.println("finally--end");
        }
        System.out.println("main--end");
    }
}