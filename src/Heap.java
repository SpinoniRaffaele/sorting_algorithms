public class Heap {

    //is a bottom up procedure
    public void heapify(int[] arr, int i, int n){
        int largest = i; // Initialize largest as root
        int l = 2*i + 1;
        int r = 2*i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, largest, n);
        }
    }

    public void heapSort(int[] arr){
        int n = arr.length;
        // Build heap
        for (int i = n / 2 -1 ; i >= 0; i--)
            heapify(arr, i, n);

        int tmp;

        for(int i=0;i < arr.length; i++) {
            tmp = arr[0];
            arr[0] = arr[n-i-1];
            arr[n-i-1] = tmp;
            heapify(arr, 0, n - i - 1);
        }
    }
}
