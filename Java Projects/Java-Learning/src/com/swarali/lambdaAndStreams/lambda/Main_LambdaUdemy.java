package com.swarali.lambdaAndStreams.lambda;

import java.util.*;

public class Main_LambdaUdemy {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Integer x= 30;
        Integer y= 50;
        System.out.println(x.compareTo(y));

        List<String> flowers = Arrays.asList("Daisy", "Jasmine", "Hibiscus", "Rose");
        flowers.forEach(flower-> System.out.println(flower)); // for list, forEach() needs consumer interface

        List<Integer> integers= Arrays.asList(45, 32, 34, 98, 69, 20);
        //In the internal sorting implementation-
        // Initially->parameter1 is 32 and parameter2 is 45.
        // 32 is being compared with 45. 32>45 => -1 result of compare()
        integers.sort((right, left)-> right.compareTo(left) ); //for list, sort() needs Comparator interface
      //  integers.sort(Comparator.naturalOrder());
        integers.forEach(i-> System.out.println(i)); // for list, forEach() needs Consumer interface

        Map<String, String> map1= new HashMap<>();
        map1.put("Atomic Habits","James Clear" );
        map1.put("Man's search for meaning", "Victor Frankl");
        map1.put("Rich dad poor dad", "Robert Kiyosaki");

        map1.forEach((key, value) -> System.out.println(key+":"+value)); // for map, forEach needs BiConsumer interface

    }
}