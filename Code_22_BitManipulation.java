package SwaraliPractice;

public class Code_22_BitManipulation {
    public static void main(String[] args) {
        // 1. Get bit of n at given position
        // (bit mask)1<<i  AND n  => if non-zero- bit is 1 , if zero- bit is zero
       int n=3; // 0011
       int pos=2;
       int bitMask= 1<<pos; // 0001<<2 => 0100
       if((bitMask & n) ==0)
           System.out.println("bit is 0 at given pos in n");
       else
           System.out.println("bit is 1 at given pos in n");

       // 2. Set bit of n at given position - make it 1
       // (bit mask)1<<i  OR n
         n=3; // 0011
         pos=2;
         bitMask= 1<<pos; // 0001<<2 => 0100
         int newNum= bitMask | n;  // 0011 | 0100 => 0111
         System.out.println("Set bit performed: "+newNum);

       // 3. Clear bit of n at given position- make it 0
        // bit mask- 1<<i
        // (NOT of Bitmask) AND (number)
        n=4; //0100
        pos=2;
        bitMask= 1<<pos; //  0001<<2 => 0100
        bitMask=(~bitMask); // 1011
        newNum=bitMask & n; // 1011 & 0100 => 0000
        System.out.println("Clear bit performed: "+newNum); //0

    }
}
