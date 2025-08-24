package SwaraliPractice;
    // Function overloading
class learner{
    String name;
    int age;

    public void printInfo(){
        System.out.println(name+" "+age);
    }
    public void printInfo(int height){
        System.out.println(height);
    }
    public void printInfo(String name){
        System.out.println(name);
        }
    public void printInfo(int weight, int height){
        System.out.println(height+" "+weight);
        }
    // public void printInfo(int weight) would give an error.
    // Since, the function with int as parameter exists already
}

public class Code_2_CompileTimePolymorphism {
    public static void main(String[] args) {
   learner l1= new learner();
   l1.name="Swarali";
   l1.age=20;
   l1.printInfo();
   l1.printInfo(165); //height

   learner l2= new learner();
   l2.printInfo(60,170); // weight, height
   l2.printInfo("Dwight");
    }
}
