package Hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SeperateChaining {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = bufferedReader.read();
        while (n!=0){
            int hashSize = bufferedReader.read();
            String[] s = bufferedReader.readLine().split(" ");
            int x[] = new int[s.length];
            for (int i=0;i<s.length;i++){
                x[i] = Integer.parseInt(s[i]);
            }
            // TODO : implement hashing
          //  implementationOfHashing(hashSize,x);
        }
    }

   /* private static void implementationOfHashing(int hashSize, int[] x) {
        ArrayList<Integer> lists[];
        for (int i=0;i<x.length;i++){
            int v = x[i]%hashSize;
            if (lists.contains(v)){
                lists.add();
            }else {
                lists.add(new LinkedList<>());

            }
        }*/
    }
