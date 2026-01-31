package com.swarali.exceptionHandling;

public class RunTimeException {
    //RuntimeException class- unchecked exceptions

    public void m4() throws ArithmeticException{ //throws can be used with unchecked exception also. But it's not necessary

    }

    public static void main(String[] args) {

        //1. try-catch arithemetic exception
        try {
            System.out.println("try--start");
            int x = 10 / 0;
            System.out.println("try--end");
        }
        catch(ArithmeticException e){
            System.out.println("Message from java-"+e.getMessage());
            System.out.println("catch--block");
        }
        System.out.println("main--end");

    }
}
