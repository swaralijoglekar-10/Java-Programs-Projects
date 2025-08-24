package SwaraliPractice;
// Types- single level, multi-level, hierarchical,
// hierarchical- parent class is inherited by multiple subclasses

//class Milk{
//    String color;
//}
//class Butter extends Milk{ // single inheritance
//}

// Hierarchical inheritance
class Shape{
    public void printArea(){
        System.out.println("Prints the area");
    }
}
class Rectangle extends Shape{
    public void printArea(int l, int b){
        System.out.println(l*b);
    }
}

class Circle extends Shape{
    public void printArea(int r){
        System.out.println((22/7)*r*r);
    }
}
public class Code_3_Inheritance {
    public static void main(String[] args) {
//        Butter b= new Butter();
//        b.color="white";// using the data member from base class
//        System.out.println(b.color);

//Circle c = new Circle();
//c.printArea();

    }

}
