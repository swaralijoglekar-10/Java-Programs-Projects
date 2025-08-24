package SwaraliPractice;
import java.util.Scanner;
public class Code_21_ReverseStringJava {
    public static void main(String[] args) {
//     String str="hjefbj";
//     str=str+"jehrfbjerb";
//     System.out.println(str); // this is a new string. Changes are not made in the original one

        Scanner sc= new Scanner(System.in);
        // reverse string
        StringBuilder sb= new StringBuilder(sc.nextLine());
        int n=sb.length();
        for(int i=0; i<n/2; i++){
            
            char front= sb.charAt(i);
            char back= sb.charAt(n-i-1);
            sb.setCharAt(i,back);
            sb.setCharAt(n-i-1, front);

        }

        System.out.println(sb);
    }
}
