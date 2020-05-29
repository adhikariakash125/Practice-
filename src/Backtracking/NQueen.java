package Backtracking;

public class NQueen {
    private static int n = 4;

    public static void main(String[] args) {
        solveNQ();
    }

    private static void solveNQ() {
        int[][] board = {{0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};

        if (solveNQUtil(board, 0))
            printBoard(board);
        else
            System.out.println("No solution available");
    }

    private static void printBoard(int[][] board) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean solveNQUtil(int[][] board, int col) {
        if (col >= n)
            return true;
        for (int i = 0; i < n; i++) {
            if (issafe(board, i, col)) {
                board[i][col] = 1;
                if (solveNQUtil(board, col + 1))
                    return true;

                board[i][col] = 0;
            }
        }
        return false;
    }

    private static boolean issafe(int[][] board, int row, int col) {
        int i, j;
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        for (i = row, j = col; j >= 0 && i >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        for (i = row, j = col; j >= 0 && i < n; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }


}