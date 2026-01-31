package com.swarali.exceptionHandling.checkedException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class throwsKeyword {

    public throwsKeyword() throws IOException, ClassNotFoundException{

    }
    public  void m1() throws IOException{

    }

    public void m2() throws ClassNotFoundException{
        try{
            throw new ClassNotFoundException("efrfr");
        }
        catch(RuntimeException e){

        }
    }

    public void m3() throws IOException{
        try{
            throw new ClassNotFoundException("sjjfbejf");
        }
        catch(ClassNotFoundException e){

        }
    }

    public void m4() throws ArithmeticException{ //throws can be used with unchecked exception also. But it's not necessary

    }

    public static void main(String[] args) throws FileNotFoundException{

            FileReader fr = new FileReader("abc.txt");

    }

}
