package com.swarali.OOP_GroupStudy;

import java.util.Scanner;

public class StringAndStringBuilder {

    public static void main(String[] args) {
        //StringBuilder
        StringBuilder sb= new StringBuilder("aba");

        if(sb.reverse().toString().equals(sb.toString()))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");

        //String
        String str= "aba";
        int flag=0;
        for(int i=0; i<str.length()/2; i++){
            String char1= Character.toString(str.charAt(i));
            String char2= Character.toString(str.charAt(str.length()-i-1));

            if(!char1.equals(char2)) {
                System.out.println("Not palindrome");
                flag=1;
                break;
            }
        }
        if(flag==0) System.out.println("Palindrome");
        //_________________________________

        StringAndStringBuilder sb2= new StringAndStringBuilder();
        sb2.useStringMethods();
    }

   public void useStringMethods(){
       System.out.print("Enter the string to perform operations: ");
       Scanner sc= new Scanner(System.in);
       String str= sc.nextLine();

       while(true) {
           //length, character, empty, whitespace, index, lastIndex
           System.out.println("Press these keys to perform respective operations: " +
                   "1. String length | 2. character at given index | " +
                   "3. Empty String check | 4. Blank String check| " +
                   "5. Index of given character| 6.last index of given character| " +
                   "7. Quit");

           int choice = sc.nextInt();
           sc.nextLine();
           if(choice==7) break;
           switch(choice){
               case 1-> System.out.println(str.length()+ " characters are there in the String");
               case 2-> {
                   System.out.println("Enter index to print its character: ");
                   System.out.println(str.charAt(sc.nextInt()));
               }
               case 3-> System.out.println(str.isEmpty()?str+" is empty":str+" is not empty");
               case 4-> System.out.println(str.isBlank()?str+" is blank":str+" is not blank");
               case 5-> {
                   System.out.println("Enter string to find its first occurrence: " );
                   System.out.println(str.indexOf(sc.nextLine()));
               }
               case 6-> {
                   System.out.println("Enter string to find its last occurrence: ");
                   System.out.println(str.lastIndexOf(sc.nextLine()));
               }
           }
       }

   }

}
