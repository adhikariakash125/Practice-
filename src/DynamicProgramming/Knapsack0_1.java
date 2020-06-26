package DynamicProgramming;

import java.util.*;
import java.lang.*;
import java.io.*;

//https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem/0

public class Knapsack0_1 {
    public static void main (String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        while (n != 0) {
            int N = Integer.parseInt(reader.readLine());
            int W = Integer.parseInt(reader.readLine());
            String[] s = reader.readLine().split(" ");
            int[] val = convertToInteger(s);
            String[] l = reader.readLine().split(" ");
            int[] wt = convertToInteger(l);
            knapsack(wt, val, W, N); // Top-down approach
            // System.out.println(knapsackMeomorization(wt, val, W, N));   // normal approach
            n--;
        }
    }
    // private static int knapsackMeomorization(int[] wt, int[] val, int w, int n) {
//         if (n == 0 || w == 0)
//             return 0;
//         if (wt[n - 1] <= w)
//             return Math.max(val[n - 1] + knapsackMeomorization(wt, val, w - wt[n - 1], n - 1), knapsackMeomorization(wt, val, w, n - 1));
//         return knapsackMeomorization(wt,val,w,n-1);
//     }
    private static void knapsack(int[] wt, int[] val, int w, int n) {
        int[][] t = new int[n + 1][w + 1];
        for (int i = 0; i < n + 1; i++)
            for (int j = 0; j < w + 1; j++)
                if (i == 0 || j == 0)
                    t[i][j] = 0;

        for (int i = 1; i < n + 1; i++)
            for (int j = 1; j < w + 1; j++)
                if (wt[i-1] <= j)
                    t[i][j] = Math.max(val[i - 1] + t[i - 1][j - wt[i - 1]], t[i - 1][j]);
                else
                    t[i][j] = t[i - 1][j];

        System.out.println(t[n][w]);
    }

    private static int[] convertToInteger(String[] s) {
        int x[] = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            x[i] = Integer.parseInt(s[i]);
        }
        return x;
    }

}