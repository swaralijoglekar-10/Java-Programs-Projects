/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {

            // Number pyramid	    
// 	  1 
//   2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5 
	    
	    // My solution:-
	    
		int frontSpaces=4;
		for(int i=1; i<=5; i++){
		    for(int j=1; j<=frontSpaces; j++){
		       System.out.print(" "); 
		    }
		    frontSpaces--;
		    for(int k=1; k<=i; k++){
		        System.out.print(i);
		        System.out.print(" ");
		    }
		    System.out.println();
		}
	}
}
