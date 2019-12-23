package Heap;

public class Deletion {
    public static void main(String[] args) {
        int[] x = {10, 5, 3, 2, 4};
        int n = x.length;
        n = deleteRoot(x, n);
        print(x,n);
    }

    private static void print(int[] x, int n) {
        for (int i=0;i<n;i++){
            System.out.print(x[i] + " ");
        }
    }

    private static int deleteRoot(int[] x, int n) {
        x[0] = x[n - 1];
        n = n - 1;
        heapify(x, n, 0);
        return n;
    }

    private static void heapify(int[] x, int n, int i) {
        int largest = i;
        int l = i*2+1;
        int r = i*2+2;

        if (l<n && x[l]>x[largest])
            largest = l;

        if (r<n && x[r]>x[largest])
            largest = r;

        if (largest!=i){
            int swap = x[largest];
            x[largest] = x[i];
            x[i] = swap;
            heapify(x,n,largest);
        }
    }
}