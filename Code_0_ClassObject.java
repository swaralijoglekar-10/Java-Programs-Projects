package SwaraliPractice;

class Student{
    String name;
    int age;

    void getInfo(){
        System.out.println("Name is "+this.name+" and Age is "+this.age);
    }
}
public class Code_0_ClassObject {
    public static void main(String[] args) {
        Student s = new Student();
        // Student() is the constructor

        // When an object is created using a new keyword,
        // then space is allocated for the variable in a heap,
        // and the starting address is stored in the stack memory.

        s.age=20;
        s.name="Swarali";
        s.getInfo();
    }
}
