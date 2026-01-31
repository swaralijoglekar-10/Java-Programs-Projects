package com.swarali.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
    private int empId;
    private String empName;

    public Employee(int empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }
    public int getEmpId(){
        return this.empId;
    }
    public String getEmpName(){
        return this.empName;
    }

    @Override
    public int compareTo(Employee e){
        return this.empId - e.empId; //employee id wise sorting
    }

}

public class SortWithComparable{

    public static void main(String[] args) {
        // Sorting with Comparable

        Employee emp1= new Employee(102, "Keshav");
        Employee emp2= new Employee(101, "Damodar");
        List<Employee> list1= new ArrayList<>();
        list1.add(emp1);
        list1.add(emp2);

        Collections.sort(list1);

        for(Employee e: list1){
            System.out.println(e.getEmpId()+" "+e.getEmpName());
        }
    }


}
