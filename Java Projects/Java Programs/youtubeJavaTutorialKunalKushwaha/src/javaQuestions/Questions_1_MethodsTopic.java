package javaQuestions;

import java.lang.Math;

//Questions
//1. Prime number
//2. Armstrong number
//3. Print all 3-digit armstrong numbers

public class Questions_1_MethodsTopic {

    // My Method
    public static boolean isPrime(int num){
        if(num< 0 || num==0 || num==1) // if(num<=1)
            return false;
        else if(num==2)
            return true;
        else{
            
            for(int i=2; i<=Math.sqrt(num); i++)
                if(num%i ==0)
                    return false; //not prime
            return true;
        }

        // My logic-
        //int x= 30;
        // check from 2 to square root of 30
        // from 2 to 5 numbers
        // 2* 15
        // 3* 10
        // 5* 6
        // here, all the factors have been covered.

    }

    //Kunal's method- Prime number
    public static boolean isItPrime(int n){
        if(n<=1)
            return false;
        
        int c;
        // instead of taking the square root like my method, 
        //he checked the squares of numbers 
        // from 2 until the square is less than the number
        for(c=2; (c*c)<=n; c++)  // he had used while loop
            if(n%c ==0)
                return false;
        
        return true;
    }

    // My logic- Armstrong number
    public static int noOfDigits(int num){  // check number of digits first
        int count=0;
        if(num==0)
            return 1;
        while(num!=0){
            num/=10;
            count++;
        }
        
        return count;
    }
    
    public static boolean isArmStrong(int n){
        int n_copy= n;
        int sum=0;
        int numberOfDigits= noOfDigits(n);
        while(n_copy!=0){
            int r= n_copy%10;
            sum+=Math.pow(r, numberOfDigits);
            n_copy/=10;
        }
        if(sum==n)
            return true;
        else
            return false;
    }

    // Print all 3-digit armstrong numbers
    public static void printAll3digitArmstrong(){
        for(int i=100; i<=999; i++)
            if(isArmStrong(i))
                System.out.println(i+" ");
    }

    public static void main(String[] args) {
    //1. Prime number
    //2. Armstrong number
    //3. Print all 3-digit armstrong numbers
        
    // 1) Prime number
    int x= 3;

    // My method
        if(isPrime(x)==false)
            System.out.println("Not prime number"); // can also be a negative number(neither prime nor composite)
        else
            System.out.println("Prime number");
    
    //Kunal's method
    if(isItPrime(x)==false)
        System.out.println("Not prime number"); // can also be a negative number(neither prime nor composite)
    else
        System.out.println("Prime number");


    // 2) Armstrong number
    int y= 1634;
    String output= isArmStrong(y) ? "is armstrong number": "not an armstrong number";
    System.out.println(output);

    // 3) Print all 3-digit armstrong numbers
    printAll3digitArmstrong();

    }  
}
