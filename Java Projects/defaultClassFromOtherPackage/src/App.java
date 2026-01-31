

// Can we access a default method inside default class from another package

import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        List<dataModel> list1= new ArrayList<>();
        list1.add(0, new dataModel(1, "xyz", "abc"));
        list1.add(1, new dataModel(2, "ghj", "trw"));
        System.out.println(list1.get(0).id+ " "+list1.get(0).name+ " "+list1.get(0).typeTwo);

        // the 4th String data memeber was not assigned value and it's null

    }
}
