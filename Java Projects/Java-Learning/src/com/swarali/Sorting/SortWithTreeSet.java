package com.swarali.Sorting;
import java.util.Set;
import java.util.TreeSet;

class Student {
    private int rollno;
    private String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public int getRollNo() {
        return this.rollno;
    }

    public String getName() {
        return this.name;
    }

    public void setRollno(int rn) {
        this.rollno = rn;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class SortWithTreeSet {
    public static void main(String[] args) {

        //     ** THIS CODE GENERATES CLASS CAST EXCEPTION **
        //1. java.lang.ClassCastException: class com.swarali.Sorting.Student cannot be cast to class java.lang.Comparable
//        Student stu1= new Student(101, "Swarali");
//        Student stu2= new Student(102, "Swarali");
//
//        Set<Student> set1= new TreeSet<Student>();
//        set1.add(stu1);
//        set1.add(stu2);
//
//        for(Student stu: set1)
//            System.out.println(stu);

    }
}
