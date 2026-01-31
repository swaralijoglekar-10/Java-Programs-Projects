package com.swarali.exceptionHandling.throwCustomException;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(String s){
        super(s);
    }
}

class Main{

    public static void validVote(int age){
        if(age<18)
            throw new ArithmeticException("You can't vote.");
    }

    public static void isPositive(int num){
        try {
            if (num < 0)
                throw new IllegalArgumentException("Positive integer needed.");
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }

    public static void main(String[] args) throws UserNotFoundException {
        String username= "swarali";
        if(!username.equals("swarali")) {
            throw new UserNotFoundException("user swarali not found");
        }
        validVote(18);
        isPositive(-67);
    }
}
