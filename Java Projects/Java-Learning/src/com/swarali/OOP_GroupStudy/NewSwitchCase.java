package com.swarali.OOP_GroupStudy;

import java.util.Scanner;

public class NewSwitchCase {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("Press A- Addition | " +
                    "Press S- Subtraction | "+ "Press M- Multiplication | "
            + "Press D- Division | "+"Press Q- Quit Operation");
            String str= sc.nextLine();
            if("Qq".contains(str))
                break;
            str=str.toLowerCase();

            System.out.println("Pass the integers:");
            int x= sc.nextInt();
            int y= sc.nextInt();
            sc.nextLine();
            switch(str){
                case "a"-> System.out.println(x+y);
                case "s"-> System.out.println(x>y?x-y:y-x);
                case "m"-> System.out.println(x*y);
                case "d"-> System.out.println(x/y);
            }
        }
    }
}
