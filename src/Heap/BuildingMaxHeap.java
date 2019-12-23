package Heap;

public class BuildingMaxHeap {
    public static void main(String[] args) {
        int[] x = {1,23,12,9,30,2,50};
        int n = x.length;
        buildHeap(x, n);
        printHeap(x);
    }

    private static void printHeap(int[] x) {
        for (int i = 0; i < x.length ; i++)
            System.out.print(x[i] + " ");
    }

    private static void buildHeap(int[] x, int n) {
        int start_index = (n - 2) / 2;
        for (int i = start_index; i >= 0; i--) {
            heapify(x, n, i);
        }
    }

    private static void heapify(int[] x, int n, int i) {
         int largest = i;
        int l = i * 2 + 1;
        int r = i * 2 + 2;
        if (l < n && x[largest] < x[l])
            largest = l;
        if (r < n && x[largest] < x[r])
            largest = r ;

        if (largest != i) {
            int swap = x[largest];
            x[largest] = x[i];
            x[i] = swap;
            heapify(x, n, largest);
        }
    }
}
