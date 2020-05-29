package Backtracking;

public class RatMaze {
    static int n;

    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        int[][] maze = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}};

        n = maze.length;
        int[][] sol = new int[n][n];
        if (solveMaze(0, 0, maze, sol))
            printSolution(sol);
        else
            System.out.println("No suitable path");
    }

    private static boolean solveMaze(int x, int y, int[][] maze, int[][] sol) {
        if (x == n - 1 && y == n - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        if (isSafe(x, y, maze)) {
            sol[x][y] = 1;

            if (solveMaze(x + 1, y, maze, sol))
                return true;
            if (solveMaze(x, y + 1, maze, sol))
                return true;

            sol[x][y] = 0;
            return false;

        }

        return false;
    }

    private static boolean isSafe(int x, int y, int[][] maze) {
        return x > -1 && y > -1 && x < n && y < n && maze[x][y] == 1;
    }


    private static void printSolution(int[][] maze) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }
}
