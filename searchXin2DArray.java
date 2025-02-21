import java.util.*;
public class searchXin2DArray {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] num = new int[n][m];

        for(int i=0;i<n;i++){     
            for(int j=0;j<m;j++){
                num[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for(int i=0;i<n;i++){    
            for(int j=0;j<m;j++){
                if(num[i][j]==x){
                    System.out.println("x if found at : ("+ i +","+ j +")");
                }
            }
        }

        sc.close();
    }
}
