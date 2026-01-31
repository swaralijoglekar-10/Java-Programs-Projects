package com.swarali.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {

        //1. Problems without generics
        List list1 = new ArrayList();
        list1.add("str");
        list1.add(45);
        list1.add(true);

        // Error- Needs typecasting- String s1= list1.get(0);
        String s1 = (String) list1.get(0);     // Compile time ERROR-> String s1= list1.get(0); Because Object to String conversion is not possible.
        System.out.println(s1);

        // ClassCast Exception
        // String s2= (String)list1.get(1); -> Not a compilation error, but will create Exception
        // Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String
        //at 1st index there is 45 which cannot be typecasted to String. But this was identified after running code.
        //This issue is solved by java generics.

        //2. List with generics. Use the following:
        //forEach, lambda expression, method reference, Iterator, enhanced for loop
        List<Integer> list2 = new ArrayList<>();
        list2.add(56);
        list2.add(0);
        list2.add(-23);
        System.out.println(list2); //[56, 0, -23]


        list2.forEach(n -> System.out.print(n + " ")); //forEach and lambda expr.
        System.out.println();
        list2.forEach(System.out::println); //method reference
        for (int x : list2) System.out.print(x + " "); //enhanced for loop

        // Compile time ERROR: int x = list1.get(1);  Object to int conversion is not possible.

        //3. Enhanced for loop and System.out.println() for list's elements without generics
        List list3 = new ArrayList();
        list3.add("strawberry");
        list3.add(50);
        list3.add(false);

        for(Object obj: list3)
            System.out.println(obj);
        //each item in the list is treated as an Object, and
        // the println method is called on each item.
        // The println method calls the toString method on the object, which
        // gives a string representation of the object that can be printed.

    }
}