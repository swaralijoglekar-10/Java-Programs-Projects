class A{
    public A(){
        System.out.println("in A");
    }
    public A(int x){
        System.out.println("in A int");
    }
}

class B extends A{
    public B(){
        super(); // this is written by default in every subclass constructor
        System.out.println("in B");
    }
    public B(int x){
       // super(); // written by default in every subclass constructor
        super(x); // call to parameterised constructor of superclass
        System.out.println("in B int");
    }
}

public class Code_30_superMethod
{
    public static void main(String[] args) {
       B obj1= new B(); // default constructor of A and default of B
       B obj2= new B(5); // parameterised of A and parameterised of B
      
      // to call parameterised constructor of superclass and default constructor of subclass,
      // write super(5) inside the default constructor of subclass
    }
}
