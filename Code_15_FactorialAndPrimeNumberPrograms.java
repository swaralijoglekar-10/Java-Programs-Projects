import java.lang.Math;
import java.util.Scanner;
public class MyClass {
    
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        
      // factorial
      MyClass a= new MyClass();
      int num=sc.nextInt();
      int f= a.fact(num);
      System.out.println(f);
      
      // prime number check
      num=sc.nextInt();
      MyClass b= new MyClass();
      boolean check=b.primeCheck(num);
      if(check==false)
        System.out.print("Not prime");
      else
        System.out.print("Prime number");
    }
    
    public int fact(int n){
        int mul=1;
        for(int i=1; i<=n; i++){
            mul=mul*i;
        }
        return mul;
    }
    
    public boolean primeCheck(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    
}