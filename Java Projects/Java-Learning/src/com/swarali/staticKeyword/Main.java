package com.swarali.staticKeyword;

public class Main {
    static int x; //global variable- static variable
    int y; //global variable- instance variable
    public void printDefault(){
        System.out.println("static variable value: "+x);
        System.out.println("Instance variable value: "+y);
    }

    public static void main(String[] arguments) { //It's not necessary to write args.
        String s= "Swarali";
        System.out.println("Previous x :"+x);
        x++;
        System.out.println("Now x: "+x);

        Main m= new Main();
        m.printDefault();

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);

        System.out.println();
    }

    public static void main(int x){
        System.out.println("Overloading- public static void main(int x)");
    }
    public void main(){
        System.out.println("Overloading- public void main()");
    }

    //Overloading
    public void printLine(){ System.out.println("void printLin()"); }
    public int printLine(String s){return 10;}

//   Error- public int printLine(){return 10;}

}
