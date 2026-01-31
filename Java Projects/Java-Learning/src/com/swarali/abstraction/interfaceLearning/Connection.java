package com.swarali.abstraction.interfaceLearning;

public interface Connection {
    //Error- not initialized -  int x;
// variables are public, static and final in interface
    int y= 78;
    void commit();
    void rollback();

    // static and default type methods can be implemented in interface
    static int myMethod(){
        System.out.println("wjhfb");
        return 10;
    }
    default int myIntMethod(){
        return 20;
    }
}
