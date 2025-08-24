package SwaraliPractice;
import java.util.Scanner;
public class Code_11_StringBasics {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //1) next(), nextLine()
        String s1=sc.next(); // word as input
        sc.nextLine(); // to avoid s2 to reject taking the input due to the pressing of enter key
        String s2= sc.nextLine(); // words with spaces/ line input
        System.out.println(s2);

        // 2) Accessing the character at the particular position/index of String charAt()
        System.out.println(s1.charAt(1));

        // 3) Comparison of strings  str1.compareTo(str2)
            //str1.compareTo(str2)  -> 0   str1 = str2
            //                      -> positive value  str1>str2  (e.g. w>b)
            //                      -> negative value  str1< str2
        System.out.println(s2.compareTo(s1));
        System.out.println("Hello".compareTo("Hello World"));  // negative value
        System.out.println("A".compareTo("a")); // negative value  (a>A)
        System.out.println("Hi".compareTo("123")); // positive value
        // Refer the ascii table- first digits, then capital letters and then small letters
        // So, more ascii value of small letters

        // Tip- Don't use == to compare strings

        // 4) length of string
        System.out.println(s2.length()+ " "+ s1.length());

        // 5) Substring
        String str= "classroom 301";
        System.out.println(str.substring(5));
        System.out.println(str.substring(5,11)); // from 5th index to 10th index
        System.out.println(str.substring(5, str.length()));
        //substring(beginIndex)  // till ending index by default
        // substring(beginIndex, endIndex)

        //   Strings are immutable in java

        // 6)  equals()
        String str1="Dwight";
        String str2="dwiGHt";
        System.out.println(str1.equals(str2));

        // 7) parseInt method of Integer class
        String str3 = "123";
        int number = Integer.parseInt(str3);
        System.out.println(number+55);

        // 8) toString
        int number1 = 123;
        String str4 = Integer.toString(number1);
        System.out.println(str4.length());



    }
}
