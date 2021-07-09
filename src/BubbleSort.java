public class BubbleSort {

    public void bubbleSort(int[] arr){
        int tmp;
        boolean swap=true;
        while(swap) {
            swap=false;
            for (int i = 0; i < arr.length - 1; i++){
                if(arr[i] > arr[i+1]){
                    tmp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = tmp;
                    swap = true;
                }

            }
        }
    }
}
