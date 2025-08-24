
class A{
    public void print(){
        System.out.println("Calm");
    }
}

class Code_26_AnonymousClasses {
    public static void main(String[] args) {
        A obj1 = new A(){
            // override
            public void print(){
                System.out.println("Happy");
            }
        };
        obj1.print(); // Happy
        A obj2= new A();
        obj2.print(); // Calm
       
    }
}
