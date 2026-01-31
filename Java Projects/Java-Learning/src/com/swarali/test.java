package com.swarali;

import java.util.regex.Pattern;

public class test {

    public static void main(String[] args) {
        String regex = "^/api/[^/]+/projects/([^/]+)/workitems(?:/([^/]+)++/finish)?/?$";
        Pattern pattern = Pattern.compile(regex);

        String[] tests = {
                "/api/v1/projects/123/workitems",
                "/api/v1/projects/123/workitems/abc/finish",
                "/api/v2/projects/projA/workitems/wi-5678/finish",
                "/api/v3/projects/projB/workitems/",
                "/api/v4/projects/projC/workitems/wi123/extra"
        };

        for (String test : tests) {
            System.out.println(test + ": " + pattern.matcher(test).matches());
        }
    }
}
