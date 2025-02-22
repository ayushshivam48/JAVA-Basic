public class Sudoku {

    // Method to check if placing the number in the given cell is safe
    public boolean isSafe(char[][] board, int row, int col, int num) {
        // Check row and column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (num + '0')) { // Check column
                return false;
            }
            if (board[row][i] == (char) (num + '0')) { // Check row
                return false;
            }
        }

        // Check 3x3 grid
        int sr = (row / 3) * 3; // Starting row index of the grid
        int sc = (col / 3) * 3; // Starting column index of the grid

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (num + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    // Recursive helper method to solve the Sudoku board
    public boolean helper(char[][] board, int row, int col) {
        // If we've reached the end of the board
        if (row == board.length) {
            return true;
        }

        // Determine next row and column
        int nrow = 0;
        int ncol = 0;
        if (col != board.length - 1) { // If not the last column
            nrow = row;
            ncol = col + 1; // Move to the next column
        } else { // Move to the next row, first column
            nrow = row + 1;
            ncol = 0;
        }

        // If the current cell is not empty, move to the next cell
        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        } else {
            // Try placing numbers 1 to 9
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    // Recursively attempt to fill the rest of the board
                    if (helper(board, nrow, ncol)) {
                        return true;
                    } else {
                        // Backtrack if the placement doesn't lead to a solution
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }

    // Method to start solving the Sudoku
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        Sudoku solver = new Sudoku();
        solver.solveSudoku(board);

        // Print the solved board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
