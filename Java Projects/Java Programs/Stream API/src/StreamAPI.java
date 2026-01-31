import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Integer> nums= Arrays.asList(4, 3, 2, 9);
        Stream<Integer> st= nums.stream();
       // st.forEach(n-> System.out.println(n));

        // stream cannot be reused.
        //This will generate IllegalStateException- st.forEach(n-> System.out.println(n));
        //because st cannot be reused now
      //  st.forEach(n-> System.out.println(n));

      //  long count= st.count();
      //  System.out.println(count);
      //We are not making any change in the list.
      //Stream<Integer> sortedData= st.sorted();
      //sortedData.forEach(n-> System.out.println(n));

      Stream<Integer> mappedSt= st.map(n->2*n);
      mappedSt.forEach(x-> System.out.print(x+ " "));
      System.out.println();
      //OR in one line it can be written as:

      nums.stream()
              .map(n->2*n)
              .forEach(x-> System.out.print(x+" "));
      System.out.println();

      nums.stream()
              .sorted()
              .map(n->n*n)
              .forEach(x-> System.out.print(x+" "));
      System.out.println();

      //print the doubles of odd numbers in stream
        nums.stream()
                .filter(n->n%2==1)
                .sorted()
                .map(n->2*n)
                .forEach(x-> System.out.print(x+" "));
        System.out.println();

        int sumOfDoubles= nums.stream().map(n->2*n).reduce(0, (a,b)->a+b);
        System.out.println(sumOfDoubles);

    }
}