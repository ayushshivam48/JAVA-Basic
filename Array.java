import java.util.*;
public class Array {
    
    public static void main(String[] args) {
        // // int[] marks = new int[3];
        // // marks[0] = 97;  //phy
        // // marks[1] = 98;  //chem
        // // marks[2] = 95;  //eng

        // int[] marks = {97,98,95};

        // // System.out.println(marks[0]);
        // // System.out.println(marks[1]);
        // // System.out.println(marks[2]);

        // for(int i=0;i<3;i++){
        //     System.out.println(marks[i]);
        // }

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];

        for(int i=0;i<size;i++){
            num[i] = sc.nextInt();
    }

        for(int i=0;i<size;i++){
                System.out.println(num[i]);
        }
        sc.close();
    }
}
