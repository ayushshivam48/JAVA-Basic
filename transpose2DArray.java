import java.util.*;
public class transpose2DArray {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] num = new int[n][m];

        for(int i=0;i<n;i++){     //input
            for(int j=0;j<m;j++){
                num[i][j] = sc.nextInt();
            }
        }

        for(int j=0;j<m;j++){     //output
            for(int i=0;i<n;i++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
