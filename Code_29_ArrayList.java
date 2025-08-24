package SwaraliPractice;

import java.util.ArrayList;
import java.util.Collections;

public class Code_29_ArrayList {
    public static void main(String[] args) {
        //ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list1= new ArrayList<Integer>();
        // ArrayList stores objects only.

        // 1. Add elements
        list1.add(0); // add at given index
        list1.add(2);
        list1.add(3);
        System.out.println(list1);

        // 2.Get elements
        int x= list1.get(1); // element at given index
        int y= list1.get(2);
        System.out.println(x+" "+y);

        // 3. Add element in between
        list1.add(1,1); // (index, element)
        System.out.println(list1); //[0,1,2,3]

        // 4. Set element at an index
        list1.set(3,4); // at index 3, set element 4.
        System.out.println(list1);

        // 5. Delete element at an index
        list1.remove(3);
        System.out.println(list1);

        // 6.size
        int size= list1.size();
        System.out.println(size);
        
        // contains() - returns true if the list contains the specified element

        // 7.loop
        for(int i=0; i<list1.size(); i++){
            System.out.println(list1.get(i));
        }

        // 8.sorting
        Collections.sort(list1);
        System.out.println(list1);



    }
}
