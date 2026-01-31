record Employee(int id, String name){
    //parameterized constructor is already present
    // public Employee(){
    //     //A non-canonical constructor must start with an explicit invocation to a constructor
    //     this(0, "");
    // }

    static String companyName;
    //Error- int x;
    // Because This is an instance variable, it should be written in record class(int id, String name, int x)
   

    //parameterized constructor
    public Employee{ //instead of writing parameters in parameterized constructor
       
        if(id==0)
            throw new IllegalArgumentException("id cannot be zero");
    }
}

public class recordClass {
    public static void main(String[] args) throws Exception {
       Employee e1= new Employee(178, "abc");
       System.out.println(e1.name() + " "+e1.id());

       //Now I want to change the name of employee e1


    }
}
