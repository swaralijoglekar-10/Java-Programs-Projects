/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    // Palindromic number pyramid
//     1
//    212
//   32123
//  4321234
// 543212345

    // My solution:-

    int frontspaces = 4;
    for (int i = 1; i <= 5; i++)
      {
	    for (int j = 1; j <= frontspaces; j++)
	    {
	         System.out.print (" ");
	    }
	    frontspaces--;
	    for (int k = i; k >= 1; k--)
	    {
	        System.out.print (k);
	    }
	    for (int m = 2; m <= i; m++)
	    {
	        System.out.print (m);
	    }
	System.out.println ();
      }



  }
}
