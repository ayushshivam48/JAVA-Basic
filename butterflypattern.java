import java.util.*;
public class butterflypattern {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // For the top half of the butterfly
        for (int i = 1; i <= n; i++) {
            // Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Print right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // For the bottom half of the butterfly
        for (int i = n; i >= 1; i--) {
            // Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Print right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
