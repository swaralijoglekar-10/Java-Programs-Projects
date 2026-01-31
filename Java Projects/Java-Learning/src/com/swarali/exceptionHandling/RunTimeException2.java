package com.swarali.exceptionHandling;

public class RunTimeException2 {
    public static void main(String[] args) {
        //2. One try multiple catch

        try{
            System.out.println("try--block");
            int y = 10*0/0;
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        catch(IndexOutOfBoundsException e1){
            System.out.println("IndexOutOfBoundsException");
        }
        catch(RuntimeException e2){
            System.out.println("RuntimeException");
        }
        catch(Exception e3){
            System.out.println("Exception class");
        }
        catch(Throwable e4){
            System.out.println("Throwable class");
        }

// Error- ArrayIndexOutOfBounds has already been caught
// If there's a relationship between exception classes, write child classes first
//        catch(IndexOutOfBoundsException e1){
//
//        }
//        catch(ArrayIndexOutOfBoundsException e2){
//
//        }

    }
}
