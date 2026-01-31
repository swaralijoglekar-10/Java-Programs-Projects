package javaPrograms;
import java.io.*;
import java.util.*;

public class Arrays {
    
    public static void changeArray(int[] array2){
        array2[0]= 99; // this change will reflect in array1 also
    }

    public static int x= 40;
   
    public static void main(String[] args) {
        int[] array1= {3, 6, 43};
        changeArray(array1);
       for(int element:array1) System.out.println(element);

       int[] array2= new int[4];
       System.out.println(array2[0]); // elements are not initialized, but int array element will contain 0.  
       
       fun();

       int[] array3; // declaration, array3 is getting defined in stack
       array3= new int[4]; // object is being created in heap memory

       String[] stringArray1= new String[2];
       System.out.println(stringArray1[0]); // null value of String array elements

       for(int i=0; i< stringArray1.length; i++){
            System.out.println(stringArray1[i]);
       }

       // Print the array
      // I don't know why I'm getting error here- System.out.println(Arrays.toString(array1));

    }

    static void fun(){
        System.out.println(x);
    }
}
