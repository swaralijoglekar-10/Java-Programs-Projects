package com.swarali.collectionFramework;

import java.util.*;

public class ListInJava {

    public static void main(String[] args) {

        //1. List, add() method
        List<Integer> list1= new ArrayList<Integer>();
        list1.add(10);
        list1.add(67);
        list1.add(43);

        int x= list1.get(2); //get() method
        System.out.println(x);
        System.out.println(list1);

        //Iterator, iterator(), hasNext(), next()
        Iterator<Integer> it1= list1.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }

        //Iterator with custom class

        List<Student> list2= new ArrayList<>();
        Student s1= new Student(101, "Swarali", "Pune");
        Student s2= new Student(102, "Aditi", "Mumbai");
        list2.add(s1);
        list2.add(s2);
        System.out.println("Students' information:");
        Iterator<Student> it2= list2.iterator();
        while(it2.hasNext()){
            Student temp= it2.next();
            System.out.println(temp.rollno+" "
            +temp.name + " " + temp.address
            );
        }
// My mistake->In your while loop, you are calling the next() method three times in a single iteration,
// which means you are skipping over the second and third elements in the iterator.

    // List inside a list
    List<String> Maharashtra= new ArrayList<>();
    List<String> Gujarath= new ArrayList<>();
    List<List<String>> India= new ArrayList<>();
    Maharashtra.add("Mumbai");
    Maharashtra.add("Pune");
    Gujarath.add("Gandhinagar");
    Gujarath.add("Vadodara");

    India.add(Maharashtra);
    India.add(Gujarath);

    Iterator<List<String>> it3= India.iterator();
    while(it3.hasNext()){
        List<String> state= it3.next();
        Iterator<String> it4= state.iterator();
        System.out.println("Cities in states:");
        while(it4.hasNext()){
            String city= it4.next();
            System.out.print(city+" ");
        }
        System.out.println();
    }

    // Looping List<List<String> using lambda expressions
    India.forEach(state-> state.forEach(city-> System.out.println(city)));

    //Looping List<List<String>> using method reference
    India.forEach(state-> state.forEach(System.out::println));

    // sort elements in list
        Collections.sort(list1);
        System.out.println(list1);

    }
}
