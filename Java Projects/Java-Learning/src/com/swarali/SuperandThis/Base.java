package com.swarali.SuperandThis;

public class Base {
    int var= 30;
    public Base(){
        System.out.println("Constructor-Base Class");
    }
    public Base(String str){
        System.out.println("String parameter in base class constructor "+str);
    }

    public int VarIncrease(int m){
        return var+m;
    }
}
