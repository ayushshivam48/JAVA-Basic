import java.util.*;
public class ArrayisAscendingornot {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];

        for(int i=0;i<size;i++){
            num[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0;i<num.length-1;i++){
            if(num[i]>num[i+1]){
                isAscending = false;
            }
        }

        if(isAscending){
            System.out.println("The array is sorted in ASD order");
        }else{
            System.out.println("The array isn't sorted in ASD order");
        }
        sc.close();
    }
}
