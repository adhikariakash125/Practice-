package Heap;

// Very Important

public class HeapSortMax {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        sortHeap(arr);
        int k=3;
        printHeap(arr,k);
    }

    private static void sortHeap(int[] arr) {
        int n = arr.length;
        for (int i = n - 2 / 2; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            //call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    private static void printHeap(int[] arr,int k) {
        for (int i = 0; i < k; i++)
            System.out.print(arr[i] + " ");
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[largest] > arr[l])
            largest = l;
        if (r < n && arr[largest] > arr[r])
            largest = r;

        if (largest != i) {
            int swap = arr[largest];
            arr[largest] = arr[i];
            arr[i] = swap;
            heapify(arr, n, largest);
        }
    }
}
