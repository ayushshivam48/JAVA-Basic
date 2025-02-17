import java.util.Scanner;

public class marks {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt;

        do{
            int marks = sc.nextInt();
            
            if(marks>=90 && marks<=100){
                System.out.println("Very Good");
            }else if(marks>=60){
                System.out.println("Good");
            }else{
                System.out.println("Perform well next time");
            }

            System.out.println("Want to continue ? (yes(1) or no(0))");

            opt = sc.nextInt();

        }while(opt==1);

        sc.close();
    }
}
