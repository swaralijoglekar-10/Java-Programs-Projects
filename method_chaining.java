package com.swarali_integrity;

public class method_chaining {
	private String name;
	private String rollNum;
	
	public method_chaining setName(String name) {
		this.name= name;
		//this.rollNum= num;
		return this;
	}
	public void setNum(String num) {
		this.rollNum= num;
		//return this;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method_chaining mchain= new method_chaining();
		mchain.setName("Swarali").setNum("141");
		System.out.println(mchain.name+" "+mchain.rollNum);
		
		Class sample = method_chaining.class;
		//System.out.print(sample.name);
		
		System.out.println(sample.getClass().getSimpleName());
		
	// getClass().getSimpleName() is used to get the data type
    
		int y=100;
		String str="";
		System.out.println(((Object)y).getClass().getSimpleName());
		System.out.println(str.getClass().getSimpleName());
				
	}

}
