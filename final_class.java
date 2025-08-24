package com.swarali_integrity;

// final class- it cannot be extended.

public final class final_class {
	
	public String hostname;
	public String username ;
	
	final_class(){
		hostname="P01211142";
		username="joglesar";
	}
	
	public void display() {
		System.out.println(this.hostname+" "+this.username );
	}
	public static void main(String[] args) {
		class2 cl2= new class2();
		cl2.displayclass2();
	}
	
}

class class2 {
	
	public void displayclass2() {
	final_class f1= new final_class();
	f1.display();
	}	
	
	
}

