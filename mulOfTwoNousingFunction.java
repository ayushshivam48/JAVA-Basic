import java.util.*;
public class mulOfTwoNousingFunction {
    
    public static int calcMul (int a, int b) {
        int mul = a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int mul = calcMul(a, b);
        System.out.println(mul);
        sc.close();
    }
}
