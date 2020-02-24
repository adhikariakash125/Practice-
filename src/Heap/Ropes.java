package Heap;

public class Ropes {
    public static void main(String[] args) {
        int[] x = {4, 3, 2, 6};
        buildHeap(x, x.length);
    }

    private static void buildHeap(int[] x, int length) {
        int n = length - 2 / 2;
        for (int i = n; i >= 0; i--) {
            heapify(x, length, i);
        }
        for (int i = length - 1; i >= 0; i--) {
            int swap = x[0];
            x[0] = x[i];
            x[i] = swap;
            heapify(x, i, 0);
        }
        int m = x.length;
        int sum,swap;
        for (int i = 0; i < m; i++) {
            int l = i * 2 + 1;
            int r = i * 2 + 2;
            if (x[l] > x[r]) {
                sum = x[i] + x[r];
                swap = x[l];
            } else {
                sum = x[i] + x[l];
                swap = x[r];
            }
            x[0] = sum;
            x[1] = swap;

        }
    }

    private static void heapify(int[] x, int length, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < length && x[l] < x[largest])
            largest = l;
        if (r < length && x[r] < x[largest])
            largest = r;
        if (largest != i) {
            int swap = x[largest];
            x[largest] = x[i];
            x[i] = swap;
            heapify(x, length, largest);
        }
    }
}
