import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveCount = 0;  
        int negativeCount = 0;  
        int zeroCount = 0;      
        String choice;          

        do {

            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Do you want to enter another number? (yes/no): ");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("yes")); 

        
        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zeros: " + zeroCount);

        sc.close();
    }
}
