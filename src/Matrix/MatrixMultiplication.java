package Matrix;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] x = new int[3][3];
        int[][] y = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                x[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                y[i][j] = scanner.nextInt();
            }
        }
        int[][] z = new int[3][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                z[i][j] = 0;
                for (int k=0;k<3;k++){
                    z[i][j]+=x[i][k]*y[k][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(z[i][j]);
            }
        }

    }
}
