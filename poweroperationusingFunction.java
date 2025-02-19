import java.util.*;
import java.lang.Math;
public class poweroperationusingFunction {
    public static void power(int x, int n){
        double pow = Math.pow(x,n);
        System.out.println(pow);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        power(x, n);
        sc.close();
    }
}