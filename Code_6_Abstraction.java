package SwaraliPractice;

abstract class Animal{
    abstract void height();
    public void eat(){ // this would be accessed through child class
        System.out.println("Animal eats");
    }
    Animal(){
        System.out.println("You're creating a new animal...");
    }
    // abstract class cannot be instantiated
    // abstract class can have both abstract and non-abstract methods
    // It can have constructors and static methods
}
class Jiraffe extends Animal{
    Jiraffe(){
        System.out.println("Creating a Jiraffe...");
    }
    public void height(){
        System.out.println("6 meters");
    }
}
class Dog extends Animal{
    public void height(){
        System.out.println("0.5 meter");
    }
}
public class Code_6_Abstraction {
    public static void main(String[] args) {
    Jiraffe j= new Jiraffe();
    j.height();
    Dog d= new Dog();
    d.height();
    d.eat();
    }
}
