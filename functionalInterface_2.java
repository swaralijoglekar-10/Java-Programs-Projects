package com.swarali_integrity;


@FunctionalInterface
interface fi{
	public void sayHello();
}
@FunctionalInterface
interface sum{
	public int getSum(int a, int b);
}
@FunctionalInterface
interface oneArgumentMethod{
	public int getLength(String str);
}


public class functionalInterface_2 implements fi {
	public void sayHello() {
		System.out.println("Hello World!");
	}
	
	public static void main(String[] args) {
		functionalInterface_2 f1= new functionalInterface_2();
		f1.sayHello();
		
		fi f2=new fi() {
			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("GET");
			}
		};
		
		f2.sayHello();
		
		fi f3=()-> System.out.println("Hello"); // lambda expression
		f3.sayHello();
		
		sum s1=(a, b)->(a+b);
		int x= s1.getSum(7, 8);
		System.out.println(x);
		
		oneArgumentMethod o1= st->st.length();
	    System.out.println(o1.getLength("Process"));
	    
	 
	    
		
	}
}
