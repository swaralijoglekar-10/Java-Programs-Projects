package com.swarali_integrity;

public class anonymousClassExample {
	
	int x;

	public void display() {
		System.out.println(this.x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Method 1
		anonymousClassExample aclass1= new anonymousClassExample() {
			public void display() {
				System.out.println("the attribute is: "+this.x);
			}
		};
		
		aclass1.display();
		
	//	int j= Integer.parseInt("12");
	//	System.out.println(j);
		
		
		
	}

}


