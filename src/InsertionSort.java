public class InsertionSort {
    int tmp;

    public void insertionSort(int[] array){
        for(int i=1; i<array.length; i++){
            int tmp = array[i];
            int j=i-1;
            while(j>=0 && tmp < array[j]){
                array[j+1] = array[j];
                j--;
            }
            j++;
            array[j] = tmp;
        }
    }
}
