import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

class Projects{
    // public int id;
     public String name;
    
}

// THIS SYNTAX IS WORKING

public class App {

    //  public <T> T doSomething(Class<T> className) throws ReflectiveOperationException{
        
    //     Constructor<T> constructor = className.getConstructor();
    //     return constructor.newInstance();
    // }

         public static <T> List<T> myMethod(String x, Class<T> clazz) {
        // body
        
        List<T> list1= new ArrayList<>();
       
        return list1;
        }

    public static void main(String[] args) throws Exception {

       
       // App a= new App();
        List<Projects> pClass= myMethod("response", Projects.class);
        
    }


}
