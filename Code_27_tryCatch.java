class Code_27_tryCatch {
	public static void main(String args[]) {
		// Your code goes here
		int a=3;
			int b=0;
			
		try{
			int[] arr = new int[4];
			arr[4]=a/b;
			//System.out.println("Result: "+c);
		}
		
		catch(ArithmeticException e){
			System.out.println("division failed");
			System.out.println(e);
		}
		
		// catch(ArrayIndexOutOfBoundsException e){
		// 	System.out.println("jfhbejb");
		// 	System.out.println(e);
		// }
		
		catch(Exception e){  // DOUBT- if I write this block above ArithmeticException's block, then I get the error.
			System.out.println(e);
		}
		 
		// try{
		// 	int [] arr= {1,2,3,4};
		// 	System.out.println(arr[4]);
		//  }
		
		
		
		// catch(ArrayIndexOutOfBoundsException e){
		// 	System.out.println("jfhbejb");
		// 	System.out.println(e);
		// }
		
		
	}
}