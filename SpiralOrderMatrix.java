import java.util.*;
public class SpiralOrderMatrix {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        for(int i=0;i<n;i++){     
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int row_start = 0;
        int row_end = n-1;
        int col_start = 0;
        int col_end = m-1;

        while(row_start <= row_end && col_start <= col_end){

            for(int col=col_start;col<=col_end;col++){
                System.out.print(matrix[row_start][col]+" ");
            }
            row_start++;

            for(int row=row_start;row<=row_end;row++){
                System.out.print(matrix[row][col_end]+" ");
            }
            col_end--;

            for(int col=col_end;col>=col_start;col--){
                System.out.print(matrix[row_end][col]+" ");
            }
            row_end--;

            for(int row=row_end;row>=row_start;row--){
                System.out.print(matrix[row][col_start]+" ");
            }
            col_start++;
        }
        sc.close();
    }
}
