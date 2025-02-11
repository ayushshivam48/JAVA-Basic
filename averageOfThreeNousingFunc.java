import java.util.*;
public class averageOfThreeNousingFunc {
    public static void average(float a, float b, float c){
        float avg = (a+b+c)/3;
        System.out.println(avg);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();

        average(a,b,c);
        sc.close();
    }
}
