package com.swarali.lambdaAndStreams.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_LearningUdemy {
    public static void main(String[] args) throws IOException {
        List<Integer> intList= Arrays.asList(34, 67, 32, 21, 90, 42);

        intList.stream().filter(even->
                (even % 2 ==0)
        )
                .map(num-> (num*num))
                .sorted(
                        (right, left)->
                                (right.compareTo(left))
                )
                .map(
                        num->
                                "$"+num
                )
                .forEach(element->
                        System.out.println(element)
                );


        List<String> books= Arrays.asList("The ultimate gift", "Kill a mocking bird",
                "Wings of fire"
        );

        List<String> booksUpperCase= books
                .stream()
                .map(book-> book.toUpperCase())
                .toList();

        List<Integer> integers= Arrays.asList(45, 32, 12, 89, 54);
        int additionWith10= integers.stream()
                .reduce(10, ((x,y)-> x+y));

        List<String> beverages= Arrays.asList(
                "Kashmiri Kahawa",
                "Lassi",
                "Mastani",
                "Ice tea"
        );

        String result = beverages.stream()
                .filter(beverage-> beverage.equals("Ice tea"))
                .findFirst()
                .orElse(null);

        String response= result.equals(null)? "Not available!" : "Please have "+result;
        System.out.println(response);

        List<Integer> numbers= Arrays.asList(10, 34, 29, 10, 3, 98, 34);
        long count10= numbers.stream()
                .filter(num-> (num==10))
                .count();
        System.out.println("Count 10: "+count10);

        String[] cities= new String[]{"Nurnberg", "Bamberg", "Munich", "Dusseldorf"};
        Arrays.stream(cities).forEach(city-> System.out.println("Hello from "+city));

        Path path= Paths.get("C:\\Users\\joglesar\\Swarali\\Self-study\\Java\\java projects\\Java-Learning\\src\\com\\swarali\\lambdaAndStreams\\streams\\gpt.txt");
        Files.lines(path).forEach(line-> System.out.println(line));

    }
}
