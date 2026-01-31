package com.swarali.stringLearn;

public class StringWithNew {

    int var1;
    String var2;

    public StringWithNew(int var1, String var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public static void main(String[] args) {
        //String with new keyword
        // String is immutable

        String s1 = new String("ABC");
        s1.concat("DEF"); //referenceless object
        String s7= s1.toLowerCase();
        System.out.println("ABC in lowercase "+ s7);
        System.out.println(s1); //ABC

        s7= s7.substring(1);
        System.out.println("ABC in lowercase substring from 1st index: "+s7);

        String s2= new String("LMN");
        System.out.println(s1.equals(s2));

        //equals() in Object class and equals() in String class
        // equals() in Object- reference comparison
        StringWithNew st1 = new StringWithNew(45, "GHI");
        StringWithNew st2= new StringWithNew(45, "GHI");
        System.out.println(st1.equals(st2));


        String s3= new String("ABC");
        System.out.println(s1.equals(s3));// true
        // equals() in String- contents are checked

        String s4= "PQR";
        String s5= "IJK";
        String s6 ="PQR";
        System.out.println(s4.equals(s6));

        String s8= "12abc34";
        String s9= new String("12abc34");
        System.out.println("object made with string literal and new keyword comparison: "+s8.equals(s9));

    }
}
