package com.swarali.SuperandThis;

public class Derived extends Base {

    int var = 45;

    public Derived() {
        super("Swarali");
        System.out.println("Constructor- derived class");

    }

    public Derived(int m) {
        super("Prerana");
        System.out.println("Parameter in Derived Class Constructor: " + m);
    }

    public void printVar() {
        long var = 78;
        System.out.println(var);
        System.out.println(this.var);
        System.out.println(super.var);
    }

    public void callMethodsWithSameName(){
        this.VarIncrease();
        super.VarIncrease(67);
    }

    // Error- Clashes with base class's method, attempting to use incompatible return type
//    public void VarIncrease(int m){
//        System.out.println("from derived class");
//    }
    public void VarIncrease(){
        System.out.println("from derived class");
    }


    @Override
    public int VarIncrease(int x){
        return 10;
    }

    public static void main(String[] args) {
        int var = 456;
        System.out.println(var);
        Derived d1= new Derived();
        d1.callMethodsWithSameName();

        // Error- Cannot be referenced from static context. Main method is static
//        System.out.println(this.var);
//        System.out.println(super.var);
    }
}
