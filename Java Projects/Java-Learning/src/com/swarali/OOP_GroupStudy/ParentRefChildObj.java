package com.swarali.OOP_GroupStudy;

public class ParentRefChildObj {
}

class Animal {
    public String name;

    public void walk() {
        System.out.println("Some generic animal walk");
    }
}

class Cat extends Animal {
    public String color;

    @Override
    public void walk() {
        System.out.println("CatWalk");
    }

    public void catSpecificMethod() {
        System.out.println("This is a specific method for Cat");
    }

    public static void main(String[] args) {
        Animal animal = new Cat(); // Parent class reference to child class object
        animal.name = "Tom"; // Accessing the name variable from the Animal class
        // animal.color = "Brown"; // This line will not compile because the reference type doesn't have access to the specific variable of the child class
        animal.walk();
    }
}
