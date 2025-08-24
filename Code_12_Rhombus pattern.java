/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		// My solution
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of rhombus:");
		int x= sc.nextInt();
		int rows=x;
		int frontSpaces=x-1; // initialise
		int stars=x;
		
		
		for(int i=0;i<rows; i++){
		    for(int j=0; j<frontSpaces; j++){
		        	System.out.print(" ");
		    }
			
		    frontSpaces--;
			
		    for(int k=0; k<stars; k++){
		        System.out.print("*");
		    }
		    
		    System.out.println();
		}
		
	}
}
