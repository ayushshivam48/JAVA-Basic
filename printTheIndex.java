import java.util.*;
public class printTheIndex {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];

        for(int i=0;i<size;i++){
            num[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for(int i=0;i<num.length;i++){
                if(num[i]==x){
                    System.out.println("x found at index :"+i);
                }
        }
        sc.close();
    }
}
