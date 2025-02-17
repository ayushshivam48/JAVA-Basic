import java.util.*;
public class MaxMinValueInanArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];

        for(int i=0;i<size;i++){
            num[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<num.length;i++){
            if(num[i]<min){
                min = num[i];
            }
        }

        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max = num[i];
            }
        }
        System.out.println("Largest no:"+ max);
        System.out.println("Smallest no:"+ min);
        sc.close();
    }
}
