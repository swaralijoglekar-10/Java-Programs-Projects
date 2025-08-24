package com.swarali_integrity;

public class private_constructor {
	
	private private_constructor() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		private_constructor pc= new private_constructor();
		
		// ctrl+ spacebar -> list populate
		
	}
}

class something{
	public void display() {
		//private_constructor pc1 = new private_constructor();
		// this will give error, because constructor is private 
		// and so the object cannot be created from outside of the class
		
		// but, 
		private_constructor pc2;
		// won't give error, because this is just a reference variable
		
		
	}
	
}
