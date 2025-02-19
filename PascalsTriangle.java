import java.util.*;
public class PascalsTriangle {

    public static int pascalValue(int row, int column) {
        if (column == 0 || column == row) {
            return 1;
        }

        return pascalValue(row - 1, column - 1) + pascalValue(row - 1, column);
    }

    public static void printPascalsTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(pascalValue(i, j) + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        printPascalsTriangle(rows);
        sc.close();
    }
}
