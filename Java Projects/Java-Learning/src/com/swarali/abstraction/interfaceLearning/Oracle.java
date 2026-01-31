package com.swarali.abstraction.interfaceLearning;

public class Oracle implements Connection {
    public void commit(){
        System.out.println("Oracle- commit");
    }
    public void rollback(){
        System.out.println("Oracle- rollback");
    }

}
