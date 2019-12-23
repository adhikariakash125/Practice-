package Heap;

public class KthLargest {
    public static void main(String[] args) {
        int[] x = {4,3,7,6,5};
        int n = x.length;
        heapSort(x,n);
        //printHeap(x);
        System.out.println(x[4]);
    }

    private static void printHeap(int[] x) {
        for (int i=0;i<x.length;i++)
            System.out.print(x[i]+" ");
    }

    private static void heapSort(int[] x, int n) {
        for (int i=n-2/2;i>=0;i--){
            heapify(x,n,i);
        }
        for (int i=n-1;i>=0;i--){
            int swap = x[0];
            x[0] = x[i];
            x[i] = swap;
            heapify(x,i,0);
        }
    }

    private static void heapify(int[] x, int n, int i) {
        int largest = i;
        int l = i*2+1;
        int r = i*2+2;
        if (l<n && x[l]<x[largest])
            largest = l;
        if (r<n && x[r]<x[largest])
            largest = r;
        if (largest!=i){
            int swap = x[largest];
            x[largest] = x[i];
            x[i] = swap;
            heapify(x,n,largest);
        }
    }
}