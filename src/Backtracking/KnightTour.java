package Backtracking;


public class KnightTour {
    private static int n = 8;

    public static void main(String[] args) {
        solveKT();
    }

    private static void solveKT() {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = -1;
            }
        }
        int[] xMove = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] yMove = {1, 2, 2, 1, -1, -2, -2, -1};

        matrix[0][0] = 0;
        if (!solveKTUtils(0,0,1,matrix,xMove,yMove))
            System.out.println("No suitable solution");
        else
            printMatrix(matrix);
    }

    private static boolean solveKTUtils(int x, int y, int movei, int[][] matrix, int[] xMove, int[] yMove) {
            if (movei == n*n)
                return true;
            int k,next_x,next_y;
            for (k=0;k<8;k++) {
                next_x = x + xMove[k];
                next_y = y + yMove[k];
                if (isSafe(next_x, next_y, matrix)) {
                    matrix[next_x][next_y] = movei;
                    if (solveKTUtils(next_x, next_y, movei + 1, matrix, xMove, yMove))
                        return true;
                    else
                        matrix[next_x][next_y] = -1; //backtracking
                }
            }
            return false;
    }



    private static boolean isSafe(int next_x, int next_y, int[][] matrix) {
        return (next_x>-1 && next_y>-1 && next_x<n && next_y<n && matrix[next_x][next_y]==-1);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
