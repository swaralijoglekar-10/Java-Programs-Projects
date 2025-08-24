package SwaraliPractice;

class child{
    static String schoolName;
    int rollNo;
}
public class Code_8_staticKeyword {
    public static void main(String[] args) {
        child.schoolName="Marion Cross";
        child c1= new child();
        c1.rollNo=108;
        System.out.println(child.schoolName);

    }
}
