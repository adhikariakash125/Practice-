package Heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// TODO: Complete the code
public class KthLargestInStream {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(reader.readLine());
        String[] s = reader.readLine().split(" ");
        int k = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        String[] t = reader.readLine().split(" ");
        int x[] = new int[n];
        for (int i = 0; i < t.length; i++) {
            x[i] = Integer.parseInt(t[i]);
            buildHeap(x);
        }

    }

    private static void buildHeap(int[] s) {
        int n = s.length;
        for (int i = n - 2 / 2; i >= 0; i--) {
            heapify(s, n, i);
        }
        for (int i=n-1;i>=0;i--){
            int swap = s[0];
            s[0] = s[i];
            s[i] = swap;
            heapify(s,i,0);
        }
    }

    private static void heapify(int[] s, int n, int i) {
        int largest = i;
        int l = i * 2 + 1;
        int r = i * 2 + 2;
        if (l<n && s[largest]<s[l])
            largest = l;

        if (r<n && s[largest]<s[r])
            largest = r;

        if(largest!=i){
            int swap = s[largest];
            s[largest] = s[i];
            s[i] = swap;
            heapify(s,n,largest);
        }
    }
}
