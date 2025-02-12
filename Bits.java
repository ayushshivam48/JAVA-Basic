import java.util.*;
public class Bits {
    
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);

        Scanner sc = new Scanner(System.in);
        int opr = sc.nextInt();

        if((bitMask & n) == 0){
            System.out.println("Bit was zero.");
        }else{
            System.out.println("Bit was one.");
        }

        int newNum1 = bitMask | n ;
        System.out.println(newNum1);

        int newNum2 = notBitMask & n ;
        System.out.println(newNum2);

        if(opr==1){
            int newNum3 = bitMask | n;
            System.out.println(newNum3);
        }else{
            int newBitMask = ~(bitMask);
            int newNum3 = newBitMask | n;
            System.out.println(newNum3);
        }
        sc.close();
    }
}
