import java.util.List;

public class FunctionalProgrammingExercises {
    
    public static void main(String[] args) {

        List<Integer> intList=List.of(34,98, 67, 23);

        //Functional Programmning
        //1. Print only odd no.s from the list
        intList.stream().filter(number-> (number%2)!=0).forEach(System.out::println);

        List<String> courses= List.of("Spring", "Spring Boot", "API", "Microservices");
        //2. Print all courses
        courses.stream().forEach(System.out::println);

        //3. Print courses containing the word Spring
        System.out.println("Courses containing word \"Spring\":");
        courses.stream().filter(str -> str.contains("Spring")).forEach(System.out::println);

        // 4. Print courses whose names have at least 4 letters
        System.out.println("courses whose names have at least 4 letters:");
        courses.stream().filter(str-> str.length()>=4).forEach(System.out::println);

        // 5. Print the cubes of odd numbers in list
        intList.stream().filter(num->num%2!=0).map(x->x*x*x).forEach(System.out::println);

        //6. Print the number of characters in each course name
        courses.stream().map(course->course+" "+course.length()).forEach(System.out::println);

    }


}
