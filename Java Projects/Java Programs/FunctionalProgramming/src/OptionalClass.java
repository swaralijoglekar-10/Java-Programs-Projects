import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalClass {
    public static void main(String[] args) {
        
        List<String> fruits= List.of("Apple", "Mango", "Banana", "Cranberry", "Guava","Litchi");
        //fruits starting with letter Z
        Predicate<? super String> predicate= f-> f.startsWith("Z");
        Optional<String> optional =fruits.stream().filter(predicate).findFirst();
        System.out.println(optional);// This won't give Exception. It'll print Optional.Empty
        System.out.println(optional.isPresent());
        System.out.println(optional.isEmpty());
        System.out.println(optional.get());

        Optional<String> empty= optional.empty();


    }
}
