package javaPrograms;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) throws Exception {
        
        Scanner sc= new Scanner(System.in);

        float x= sc.nextFloat();
        System.out.println(x);
        float y= sc.nextInt(); // no error
        // error-  int y= sc.nextFloat();
       
        int a= 257;
        byte b= (byte) a;  
        // maximum value that byte can store is 256. So even after typecsasting 257, you'll get 1 as output
        // output= 1  ;  257 % 256 = 1
        System.out.println(b); // 1

        byte c= 30;
      //  c= c * 5; cannot convert from int to byte
        c= (byte) (c*5);
        System.out.println(c);

        System.out.println("नमस्ते");  // I have not installed language pack extension, otherwise it'll display
       
        int d= 'न';
        System.out.println(d);

        float f1= 3/4.0f;
        //float f2= 3/4.0;  Error- possible lossy conversion from double to float

        
        
    }
}
