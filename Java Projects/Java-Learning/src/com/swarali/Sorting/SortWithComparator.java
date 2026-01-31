package com.swarali.Sorting;

import java.util.*;

class Employeee{
    private int empId;
    private String empName;

    public Employeee(int empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }
    public int getEmpId(){
        return this.empId;
    }
    public String getEmpName(){
        return this.empName;
    }
}

public class SortWithComparator {
    public static void main(String[] args) {

        //1. Custom sorting with Comparator- for Set of custom class type
        // TreeSet and Comparator
        Set<Employeee> set1= null;
        //Custom sorting with Comparator
        //Sorting with employee id
        Comparator<Employeee> crId= (o1, o2)-> o1.getEmpId()- o2.getEmpId(); //compare()
        set1= new TreeSet<>(crId); //TreeSet with Comparator's reference in ()

        Employeee e1= new Employeee(104, "Radha");
        Employeee e2= new Employeee(102, "Vaidehi");
        set1.add(e1);
        set1.add(e2);

        for(Employeee e: set1)
            System.out.println(e.getEmpId()+ " "+e.getEmpName());

        //You can ask for user's choice for employee id or name wise sorting.


        //2. Custom sorting with comparator- for Map
        // TreeMap and comparator
        Comparator<String> cr2= (s1, s2)-> s2.compareTo(s1);  //descending order
        Map<String, Integer> map= new TreeMap<>(cr2); //TreeMap with Comparator's reference in ()
        map.put("Green", 25);
        map.put("Blue", 15);
        map.put("Red", 7);
        System.out.println(map);

    }

}
