import java.util.ArrayList;
import java.util.List;

public class NQueen {

    // Check if placing a queen at (row, col) is safe
    public boolean isSafe(int row, int col, char[][] board) {
        int n = board.length;

        // Horizontal
        for (int j = 0; j < n; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // Vertical
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Upper left diagonal
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Upper right diagonal
        for (int r = row, c = col; r >= 0 && c < n; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Lower left diagonal
        for (int r = row, c = col; r < n && c >= 0; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Lower right diagonal
        for (int r = row, c = col; r < n && c < n; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    // Save the current board configuration
    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < board[0].length; j++) {
                row.append(board[i][j]);
            }
            newBoard.add(row.toString());
        }
        allBoards.add(newBoard);
    }

    // Helper method to place queens and solve the problem
    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.'; // Backtrack
            }
        }
    }

    // Solve the N-Queens problem
    public List<List<String>> solveNQueen(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        helper(board, allBoards, 0);
        return allBoards;
    }

    // Main method to test the NQueen solver
    public static void main(String[] args) {
        NQueen nQueenSolver = new NQueen();
        int n = 4; // Change this value to test different sizes
        List<List<String>> solutions = nQueenSolver.solveNQueen(n);

        System.out.println("Solutions for " + n + "-Queens:");
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
