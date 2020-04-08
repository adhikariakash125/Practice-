package Searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class countOne {
    public static void main(String[] args) {
        int[] binaryString = {1, 1, 1, 1, 1};
        System.out.println(countNumberOfOnes(binaryString, 0, binaryString.length-1));
    }

    private static int countNumberOfOnes(int[] binaryString, int l, int r) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (binaryString[mid]==1 && mid==r || binaryString[mid+1]==0)
                return mid;
            if (binaryString[mid]==1)
                return countNumberOfOnes(binaryString,mid+1,r);
            return countNumberOfOnes(binaryString,l,mid-1);

        }
        return 0;
    }
}
