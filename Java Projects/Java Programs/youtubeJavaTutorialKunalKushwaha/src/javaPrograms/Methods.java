package javaPrograms;
import java.util.Arrays;

public class Methods {
   public static void main(String[] args) {
    String str= "Swarali";
    referenceMethod(str);
    System.out.println(str); // "Swarali"

    int[] arr= {10, 34, 23};
    System.out.println(Arrays.toString(arr));  //  [10, 34, 23]

    
    int[] array= {10, 34, 23};
    modifyArray(array);
    System.out.println(Arrays.toString(array));
    
    // Variable arguments
      VarArgs(4,76,35);
      printMultipleVarArgs("Swarali", 63, 3, 2, 10, 87);
     VarArgs(); //no argument for varargs is not an error.

      //method overloading
      System.out.println(add(4,32,76));
      // error- printVarArgs();  The method printVarArgs(int[]) is ambiguous for the type Methods
   }

   //method overloading
   static int add(int a, int b){
      return (a+b);
   }
   static int add(int a, int b, int c){
      return (a+b+c);
   }

   public static void VarArgs(int ...v){
      System.out.println(Arrays.toString(v));
   }

   // var args should be at the end of all parameters
   private static void printMultipleVarArgs(String string, int i, int j, int ...k) {
      System.out.println(string+" "+ i+" "+j);
      System.out.println(k[0]);
   }

   // method overloading on varargs
   public static void printVarArgs(int ...v){
      System.out.println(Arrays.toString(v));
   }

   public static void printVarArgs(String ...v){
      System.out.println(Arrays.toString(v));
   }

   public static void modifyArray(int[] arrNew){
    arrNew[0]= 32;
    }
   
   public static void referenceMethod(String s){
        s= "Hello World!";
    // this is creating new object
   }

}
