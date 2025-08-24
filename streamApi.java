package com.swarali_integrity;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamApi {
	public static void main(String[] args) {
		
		// snippet 1
					List<Integer> list1= List.of(3,2,21,56,98);
					Stream<Integer> st= list1.stream();
/*even numbers*/	List<Integer> newlist= st.filter(i-> i%2==0).collect(Collectors.toList());
					System.out.println(newlist);
		
		
		
		
	}

}
