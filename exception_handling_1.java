package com.swarali_integrity;

import java.io.IOException;

public class exception_handling_1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		// Throwble class- 1.Error 2.Exception  Exception class has Runtime Exception class and other classes
		// Runtime exception is unchecked exception
		// examples-> NullPointerException, ArithmeticException
		
		// After try block, the correct catch block or finally block will execute
		// multiple catch blocks allowed, only one finally allowed
//     _____________________________________________________________________	
		
			// *** For unchecked exceptions
		//1. default throw default catch
		
//		int x=10/0;
//		System.out.print(x);
		
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at com.swarali_integrity.exception_handling_1.main(exception_handling_1.java:10)
// Program ends after java's default catch

		//2. default throw our catch
		try {
			int x=10/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println(e.getMessage()+" "+e.getClass());
		}
		// statements after catch block are also executed, given that correct catch block was written and executed
		System.out.println("Hello World");
		
		//3. our throw default catch
		int balance= 10000;
		int withdraw= 30000;
		if(withdraw>balance)
			throw new ArithmeticException("withdraw amount more than balance");
		
		// We can't have catch or finally clause without try statement
		//4. our throw our catch
		int b=30;
		int w=50;
		try {
		if(w>b)
			throw new ArithmeticException("fill up your balance");
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		
	// ______________________________________________________________	
	//  ***   For checked exceptions	
	//checked exception- detected at compile time
	// examples- IOException, ClassNotFoundException
	// Methods- 1. throws and throw   2. try-catch-throw
	// throws and throw- for java to handle the exception
	// try-catch-throw-  we can handle the exception
		
	 throwException();
	 
	 try { 
		 throw new IOException();
	 }
	 catch(IOException e) {
	 	System.out.println(e.getMessage());
	 }
	 
		
	}
	
	public static void throwException() throws IOException{
		throw new IOException();
		// Error at this line- Unreachable code- System.out.println("After Exception");
	}
	
	public static void multipleThrowsException() throws ClassNotFoundException, IOException {
		
	}
	
}
