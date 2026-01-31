package com.swarali.mapInterface;

import java.util.*;

public class MapInJava {
    //Map interface
    //Map is not a part of collection framework
    // Use- While configuring database connection properties

    public static void main(String[] args) {
        // 1. Map without generics
        Map map= new HashMap();
        map.put("country", "India");
        map.put("country code", "+91");
        map.put("rank", 1);
        map.put(false, "NoSeaBorder");
        System.out.println(map);

        String value1= (String)map.get(false); //typecasting- because of no generics
        System.out.println(value1);
// --------------------------------------------------------------------
        //2. Map with generics
        Map<Integer, String> map2= new HashMap<>();
        map2.put(1, "Krishna");
        map2.put(2, "Madhav");
        map2.put(3, "Govinda");

        Set<Integer> set= map2.keySet(); //get all keys of map in a set

        Iterator<Integer> it= set.iterator();
        while(it.hasNext()){
            System.out.println(map2.get(it.next()));
        }

        for(int key: set){
            System.out.println(map2.get(key));
        }

        // 3. Map with insertion order preserved- LinkedHashMap
        Map<Integer, Boolean> map3= new LinkedHashMap<>();
        map3.put(101, true);
        map3.put(102, false);
        map3.put(103, true);
        System.out.println(map3);

        //4. TreeMap- default sorting as per key
        // insertion order not preserved

        // 4.1 Treemap without generics
        Map map4= new TreeMap();
        map4.put(2, "Radhika");
        map4.put(1, "Vaidehi");
        map4.put(0, "Gaurangi");
     //ClassCastException- Integer cannot be cast to Boolean   map4.put(true, "Haripriya");


        //4.2 Treemap with generics
        Map<Integer, String> map5= new TreeMap<>();
        map5.put(23, "Hari");
        map5.put(12, "Gopesh");
        map5.put(45, "Narayan");
        System.out.println(map5); // sorting as per key

        // 5. Iteration
        // map can have one null key.
        // enhanced for loop:-  for(int key: set) - NullPointerException
        // Iterator<Integer> can have null.

    }
}
