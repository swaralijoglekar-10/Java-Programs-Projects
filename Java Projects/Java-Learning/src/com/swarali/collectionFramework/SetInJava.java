package com.swarali.collectionFramework;

import java.util.*;

public class SetInJava {
    public static void main(String[] args) {
        //unique elements, insertion order is not preserved

        //1. Set
        Set<Integer> set1= new HashSet<>();
        set1.add(45);
        set1.add(78);
        set1.add(-400);
        set1.forEach(System.out::println);

        //HashSet- remove duplicates
        //LinkedHashSet- remove duplicates and preserve insertion order
        //TreeSet- remove duplicates and sort elements

        //2. Remove duplicates from list using set and do not preserve order
        List<String> maharashtra = new ArrayList<>();
        maharashtra.add("Pune");
        maharashtra.add("Mumbai");
        maharashtra.add("Solapur");
        maharashtra.add("Pune");
        // to remove duplicates-
        Set<String> set2= new HashSet<>(maharashtra);
        System.out.println(set2);

        //3. Remove duplicates from list using set and preserve order
        Set<String> set3= new LinkedHashSet<>(maharashtra);
        System.out.println(set3);

        //4. Remove duplicates from list using set and sort elements
        Set<String> set4= new TreeSet<>(maharashtra);
        System.out.println(set4);

        //5. Copying one set into another set
        Set<Integer> set5 = new HashSet<>();
        set5.addAll(set1);

    }
}
