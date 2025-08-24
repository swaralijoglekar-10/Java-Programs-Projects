package SwaraliPractice;

class stu{
    String name;
    int age;

    stu(){   // non-parameterised

        //System.out.println("constructor called");
    }
    stu(String name, int age){  // parameterised constructor
        this.name=name;
        this.age=age;
    }

    stu(stu s){ // copy constructor
        this.name= s.name;
        this.age=s.age;
       // this.age=15;
    }
    public void printInfo(){
        System.out.println(this.name+" "+this.age);
    }

}

// Java has no destructor
// It uses automatic garbage collector that deallocates memory automatically



public class Code_1_Constructors {
    public static void main(String[] args) {
            stu s1 = new stu("XYZ",20);
            s1.printInfo();

            stu s2 = new stu(s1);
            s2.printInfo();

            stu s3= new stu();
            s3.name="Jim";
            s3.age=27;
            s3.printInfo();
    }
}
