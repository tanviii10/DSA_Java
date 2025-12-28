import java.util.ArrayList;

public class RatInMaze {

    static boolean isSafe(int x, int y, int[][] maze, int[][] visited, int n) {
        return (x >= 0 && x < n &&
                y >= 0 && y < n &&
                maze[x][y] == 1 &&
                visited[x][y] == 0);
    }

    static void solve(int x, int y, int[][] maze, int[][] visited,
                      ArrayList<String> ans, String path, int n) {

        // Base case
        if (x == n - 1 && y == n - 1) {
            ans.add(path);
            return;
        }

        // Mark visited
        visited[x][y] = 1;

        // Down
        if (isSafe(x + 1, y, maze, visited, n)) {
            solve(x + 1, y, maze, visited, ans, path + "D", n);
        }

        // Left
        if (isSafe(x, y - 1, maze, visited, n)) {
            solve(x, y - 1, maze, visited, ans, path + "L", n);
        }

        // Right
        if (isSafe(x, y + 1, maze, visited, n)) {
            solve(x, y + 1, maze, visited, ans, path + "R", n);
        }

        // Up
        if (isSafe(x - 1, y, maze, visited, n)) {
            solve(x - 1, y, maze, visited, ans, path + "U", n);
        }

        // Backtrack
        visited[x][y] = 0;
    }

    public static void main(String[] args) {

        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };

        int n = maze.length;

        ArrayList<String> ans = new ArrayList<>();
        int[][] visited = new int[n][n];

        if (maze[0][0] == 1) {
            solve(0, 0, maze, visited, ans, "", n);
        }

        System.out.println(ans);
    }
}
