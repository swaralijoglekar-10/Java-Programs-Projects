package com.swarali.exceptionHandling;

import java.lang.reflect.Array;

public class RunTimeException3 {

    public static void main(String[] args) {
        //ArrayIndexOutOfBoundsException
        //NumberFormatException
        //ArithmeticException
        System.out.println("main--start");
        try{
            String s= args[0]; //If there's no argument
            int x= Integer.parseInt(s); //If s not integer
            int a= 10/x; // If x is 0
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Argument can't be empty. Enter argument.");
        }
        catch(NumberFormatException e){
            System.out.println("Argument should have integer. Enter integer.");
        }
        catch(ArithmeticException e1){
            System.out.println("Argument can't have 0. Enter non-zero integer.");
        }
        System.out.println("main--end");
    }
}
