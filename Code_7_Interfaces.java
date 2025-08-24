package SwaraliPractice;
// All fields in interfaces are public,static and final by default
// All methods are public and abstract by default
// Interfaces support the functionality of multiple inheritance
// Interface "extends" other interface and class "implements" the interface
interface beast{
    void walk();

    // interface abstract methods cannot have body
//    void eat(){  // error
// }

}

interface carnivore{
    void eat();
}

class Lion implements beast,carnivore{ // multiple inheritance using interfaces
    public void walk(){     // DOUBT- Why did I get an error on removal of public keyword on this line? -> methods are by default public in interface
        System.out.println("Lion walks");
    }

    @Override
    public void eat() {
        System.out.println("Lion eats");
    }
}
public class Code_7_Interfaces {
    public static void main(String[] args) {
       Lion l= new Lion();
       l.eat();
       l.walk();
    }
}
