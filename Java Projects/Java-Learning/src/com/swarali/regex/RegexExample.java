package com.swarali.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String text = "This is a cat";
        String regex = "c.t"; // . matches any single character except a newline

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println(matcher.find()?"Match found": "Match not found");

        // matcher.find() advances through the string with each call
        text = "SwAral";
        regex = "[A-Z][a-z]"; // [] character class
        // [A-Z][a-z] matches any sequence of two characters where the first is
        // an uppercase letter and the second is a lowercase letter
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(text);

        for(int i=0; i<3; i++){
            boolean match = matcher.find();
            if(match) System.out.println(matcher.group());
        }
    }
}
