
@FunctionalInterface
interface A{
    void show();
}

@FunctionalInterface
interface B{
    void display(int n);
}

public class LambdaExpressions {
    public static void main(String[] args) {
        A obj1= new A(){
            public void show(){
                System.out.println("implemented for obj1");
            }
        };

        obj1.show();

        A obj2= ()-> System.out.println("implemented for obj2");
        obj2.show();

        B obj3= (x)-> System.out.println(x);
        obj3.display(10);

    }
}
