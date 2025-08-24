/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;
class Comp {
	public static void main (String[] args) {
	    // to find: x^n
	    int x,n;
	    Scanner sc= new Scanner(System.in);
	    x= sc.nextInt();
	    n=sc.nextInt();
	    
	    int power=n;
	    
	    if(n<0)  // negative power
	        power=n*(-1);
	    
	    
	    float mul=1.0f;
	    for(int i=1; i<=power; i++)
	        mul=mul*x;
	    
	    if(n<0)
	        System.out.print("Answer= "+ (1/mul));
	    else
	        System.out.print("Answer= "+mul);
	    
	}
}
