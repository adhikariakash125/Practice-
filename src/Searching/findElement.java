package Searching;

import java.util.Scanner;

public class findElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        //System.out.println(searchElement(x, m));
        System.out.println(binarySearch(x, 0, x.length, m));
    }

    private static int binarySearch(int[] x, int l, int r, int n) {
        if (r >= 1) {
            int mid = l + (r - 1) / 2;
            if (x[mid] == n)
                return mid;
            if (x[mid] > n)
                return binarySearch(x, l, mid - 1, n);
            return binarySearch(x, mid + 1, r, n);
        }
        return -1;
    }

    private static int searchElement(int[] x, int m) {
        for (int j = 0; j < x.length; j++) {
            if (m == x[j])
                return j;
        }
        return -1;
    }
}
