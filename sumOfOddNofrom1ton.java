import java.util.*;
public class sumOfOddNofrom1ton {
    
    public static void sumOfOddNo(int n){
        int sum = 0;
        for(int i=1;i<=n;i+=2){
            sum+=i;
        }
        System.out.println(sum);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sumOfOddNo(n);
        sc.close();
    }
}
