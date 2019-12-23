package Heap;

public class Insertion {
    public static void main(String[] args) {
        int[] x = { 10, 5, 3, 2, 4};
        int n = x.length;
        int key = 15;
        insert(x,n,key);
    }

    private static void insert(int[] x, int n, int key) {
            int[] y = new int[n+1];
            y[n] = key;
            for (int i=0;i<n;i++){
                y[i] = x[i];
            }
            n = n+1;
            heapify(y,n,n-1);
    }

    private static void heapify(int[] y, int n, int i) {
        if (i!=0){
            int smallest = i;
            int root = (i-1)/2;
            if (y[root]<y[smallest]){
                int swap = y[smallest];
                y[smallest] = y[root];
                y[root] = swap;
                heapify(y,n,root);
            }
        }
    }

    private static void printHeap(int[] y, int n) {
        for (int i=0;i<n;i++){
            System.out.print(y[i] + " ");
        }
    }
}