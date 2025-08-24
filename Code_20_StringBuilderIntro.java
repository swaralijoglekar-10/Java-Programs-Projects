package SwaraliPractice;

import java.util.*;
public class Code_20_StringBuilderIntro {
    public static void main(String[] args) {
        // Strings are immutable in java.
        // StringBuilder class provides an alternative to String Class, as it
        // creates a mutable sequence of characters

        StringBuilder sb= new StringBuilder("Toby");
        System.out.println(sb);

        // 1) char at index
        System.out.println(sb.charAt(0));

        // 2) set char at index
        sb.setCharAt(2,'n'); // Tony
        System.out.println(sb );
        sb.setCharAt(0,'t'); // tony

        // 3) insert at index  (e.g. Tony-> Stony, Tony-> Tonny)
        sb.insert(0,'S'); // you can also insert the string
        System.out.println(sb);  // Stony

        //4) delete
        sb.delete(0,1); // start, end (up to end but not including end )
        System.out.println(sb); // tony

        //5) Append
        sb.append(" flend");
        sb.append("erson");
        System.out.println(sb); //tony flenderson

        //6) length
        System.out.println(sb.length());
    }
}
