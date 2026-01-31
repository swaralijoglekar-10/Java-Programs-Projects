package com.swarali.abstraction.interfaceLearning;

public class Test {

    public static void main(String[] args) {
        Connection con = new Oracle();
        con.commit();
        con.rollback();
    }
}
