package com.swarali.Internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

    public static void main(String[] args) {
        double d= 123.56;

        NumberFormat nf= NumberFormat.getInstance(Locale.CANADA);
        NumberFormat nf2= NumberFormat.getInstance(Locale.GERMANY);
        System.out.println("Representation of "+d+"in Canada is: "+nf.format(d));
        System.out.println("Representation of "+d+"in Germany is: "+nf2.format(d)); //123,56

    }



}
