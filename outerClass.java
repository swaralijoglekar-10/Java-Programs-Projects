package com.swarali_integrity;

class Enclosing{
	
	//static String collegeName;
	//String division;
	static String x;
	String y;
	static String p;
	
	static class staticNested{
		String z;
		
		static void staticInnerdisplay() {
			System.out.println(x);
			// error- Cannot Make Static reference to non-static field  System.out.println(z);
			// error- Cannot Make Static reference to non-static field  System.out.println(y);
			System.out.println(p);
						
		}
		
	}
	
	public void OuterClassprint() {
		
		System.out.println(y);
		System.out.println(p);
		
	}
	
}


public class outerClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Enclosing ec1= new Enclosing();		
	Enclosing.x="xyz";
	ec1.y="abc";
	Enclosing.p="def";

	Enclosing.staticNested SN= new Enclosing.staticNested();
	SN.z= "jhfbvefb";
	
	Enclosing.staticNested.staticInnerdisplay();
	
	
	}
}


