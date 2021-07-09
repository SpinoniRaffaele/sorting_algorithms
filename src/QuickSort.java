public class QuickSort {
    public void quickSort(int[] arr,int low,int high){

        if(low < high){
            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot);
            quickSort(arr, pivot+1, high);
        }
    }

    public int partition(int[] arr, int low, int high){

        int pivot = arr[high-1];
        int index = low;
        int tmp;

        for(int j=low; j<high;j++){
            if(arr[j] < pivot){
                tmp = arr[index];
                arr[index] = arr[j];
                arr[j] = tmp;
                index++;
            }

        }
        tmp = arr[high-1];
        arr[high-1] = arr[index];
        arr[index] = tmp;

        return index;
    }
}
