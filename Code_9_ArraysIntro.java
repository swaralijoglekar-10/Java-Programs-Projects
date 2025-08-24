package SwaraliPractice;
import java.util.Scanner;
public class Code_9_ArraysIntro {
    public static void main(String[] args) {

        int[] order=new int[5]; // Way 1
       // int order[]= new int[5]; alternate declaration
        order[0]=25; // 25 orders for item 0
        order[1]=30;
        for(int i=2; i<=4; i++){
            System.out.print(order[i]+" "); // by default value as 0 for uninitialised integers
        }
        System.out.println();

        int[] age={30, 45, 67, 20}; // Way 2
        // person 0 with age 30
        for (int i=0; i<4; i++)
            System.out.print(age[i]+" ");
        System.out.println();

        System.out.print("Enter the size of array:");
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int arr[]= new int[size]; // Way 3
        System.out.println("Enter the elements:");
        for(int i=0; i<size; i++)
            arr[i]=sc.nextInt();

        for(int i=0; i<size; i++)
            System.out.print(arr[i]+" ");
        
        // length attribute to find the length of array- arr.length
        // Integer.MAX_VALUE , Integer.MIN_VALUE - constants in the integer class of java.lang package
        
    }
}
