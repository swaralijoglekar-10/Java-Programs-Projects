import java.util.List;
public class FunctionalProgramming {
    public static void main(String[] args) throws Exception {
        
        // List.of() - constructs immutable list
        List<Integer> intList= List.of(3,45,76, 92);
        System.out.println("List= "+intList);

        //traditional method for printing all the numbers inside a list
       // printAllNumbersInList(List.of(45,23,16,78,94));
       System.out.print("Printed using traditional approach of looping: ");
       printAllNumbersInList(intList);
        System.out.println();

        //Functional approach to print all numbers inside a list
       // printAllNumbersInListFunctional(List.of(45,23,89,56));
       System.out.print("Printed using functional programming- stream()- ");
       printAllNumbersInListFunctional(intList);
        System.out.println();

       //Functional approach to print even numbers in list
       System.out.println("Even numbers using functional programming- stream and lambda expression-");
       printEvenNumbersInListFunctional(intList);

       // Functional approach to print squares of even numbers in list
       printSquaresOfEvenNumbersInListFunctional(intList);

    }
  
    // printing squares of even numbers in list
    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> intList) {
        //mapping
        intList.stream().filter(n->n%2==0).map(m->m*m).forEach(System.out::println);
    }


    // printing even numbers in list with functional approach
    private static void printEvenNumbersInListFunctional(List<Integer> intList) {
       // intList.stream().filter(App::isEven).forEach(System.out::println);
        intList.stream().filter(number -> number%2==0).forEach(System.out::println); //lambda expression
    }

    // with functional approach
    private static void printAllNumbersInListFunctional(List<Integer> intList) {
        intList.stream().forEach(System.out::println);
        //  intList.stream().forEach(App::print);
        //  ::  method reference syntax
    }

    // traditional approach of looping
    private static void printAllNumbersInList(List<Integer> intList) {
        for(int n:intList){
            System.out.println(n);
        }
    }

     // private static void print(int num){
    //     System.out.println(num);
    // }

    // private static boolean isEven(int number){
    //     return number%2==0;
    // }
}
