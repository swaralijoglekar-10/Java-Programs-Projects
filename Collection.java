package com.swarali_integrity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map= new HashMap<>(5); // initial capacity 5
		// OR	
		// HashMap<String, Integer> map= new HashMap<String, Integer>();
		map.put("swarali",41);
		map.put("neha", 35);
		System.out.println(map);
		System.out.println(map.size());
		
		System.out.println(map.get("swarali"));
		
		if(map.containsKey("priya"))
			System.out.println(map.get("priya"));
		
	// iterate the map using for each loop
		for(Map.Entry<String, Integer> e: map.entrySet())
			System.out.println(e.getKey()+" "+e.getValue());
		
		map.remove("neha");
		System.out.println(map);
		
		// iterate the map using for each loop
		for(Map.Entry<String, Integer> e: map.entrySet())
			System.out.println(e.getKey()+" "+e.getValue());
		
		
		ArrayList<Integer> L1= new ArrayList<>();
		L1.add(49);
		L1.add(57);
		L1.add(95);
		L1.remove(0); // remove element at index 0
		System.out.println(L1);
		
		Iterator it= L1.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}
}
