import java.util.ArrayList;
import java.util.List;

public class NQueen {

    static boolean isSafe(char[][] board, int row, int col, int n) {

        // Check same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Check upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check upper-right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    static void solve(int row, char[][] board, List<List<String>> ans, int n) {

        // Base case
        if (row == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }

        // Try placing queen in each column
        for (int col = 0; col < n; col++) {

            if (isSafe(board, row, col, n)) {

                // Choose
                board[row][col] = 'Q';

                // Explore
                solve(row + 1, board, ans, n);

                // Backtrack
                board[row][col] = '.';
            }
        }
    }

    public static void main(String[] args) {

        int n = 4;
        char[][] board = new char[n][n];

        // Initialize board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        List<List<String>> ans = new ArrayList<>();
        solve(0, board, ans, n);

        System.out.println(ans);
    }
}
