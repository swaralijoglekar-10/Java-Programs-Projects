package com.swarali.abstraction.interfaceLearning;

public class MySql implements Connection{

    @Override
    public void commit() {
        System.out.println("commit- mysql");
    }

    @Override
    public void rollback() {
        System.out.println("rollback- mysql");
    }
}
