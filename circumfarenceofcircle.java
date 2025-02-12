import java.util.*;
public class circumfarenceofcircle {
    
    public static void circumfarence(int r){
        double pi = 22/7;
        double circumfarence = 2*(pi)*r;
        System.out.println(circumfarence);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        circumfarence(r);
        sc.close();
    }
}
