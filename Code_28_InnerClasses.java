import java.util.*;

class Milk{
  int litres;
  Milk(int lit){
    this.litres=lit;
    Paneer p = new Paneer();
    p.print();
  }
  private class Paneer{
    public void print(){
      System.out.println(litres+ " litres of milk needed");
    }
  }
  
}




public class Code_28_InnerClasses {
    public static void main(String[] args) {
      Milk m = new Milk(2);
  }
}