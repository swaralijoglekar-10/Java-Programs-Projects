
import java.util.Scanner;

// Write a program to enter the numbers till the user wants and at the end it
//should display the count of positive, negative and zeros entered.

public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int pos=0,neg=0,zeros=0;
		
		char s='y';
		while(s=='y'|| s=='Y'){
		    System.out.println("Enter the number");
		    int num=sc.nextInt();
		    if(num>0)
		        pos++;
		    else if(num<0)
		        neg++;
		    else
		        zeros++;
		    System.out.println("Type y to continue...");
		    s=sc.next().charAt(0);
		}
		
		System.out.print("Positive no.s: "+pos+"\nNegative no.s: "+neg+"\nZeros: "+zeros);
	}
}
