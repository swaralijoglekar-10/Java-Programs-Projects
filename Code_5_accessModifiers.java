package SwaraliPractice;
class creditCard{
    String cardHolder; // default
    public int creditLimit;
    private int PIN;
    protected String bankName;

    public int getPIN(){
        return this.PIN;
    }
    public void setPIN(int pincode){
        this.PIN=pincode;
    }
}
public class Code_5_accessModifiers {
    public static void main(String[] args) {
        creditCard c1= new creditCard();
        c1.cardHolder="ABC XYZ";
        c1.creditLimit=1000;
        // PIN is private and so can't be accessed here.

        c1.setPIN(1111);
        System.out.println("Your PIN is: "+c1.getPIN());

        c1.bankName="JPMorgan Chase"; // protected
    }
}
