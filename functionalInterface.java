package com.swarali_integrity;

// Functional interface contains only one abstract method
@FunctionalInterface
interface iface{
	void display();
	String toString();
//	void show();
}

public class functionalInterface extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
	 iface if1= new iface() {
		 public void display() {
		 	System.out.println("Hello");
		 }
	 };
	
*/
		iface if1= ()-> System.out.println("Hello");
		// () can contain parameters if required for the methodx
		// -> is lambda expression
		
		
		if1.display();
		
	}

}
