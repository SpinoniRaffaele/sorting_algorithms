public class MergeSort {
    public void mergeSort(int[] arr, int l, int r){
        if(r<=l) return;
        int medium = l+(r-l)/2;
        mergeSort(arr, l, medium);
        mergeSort(arr, medium+1, r);

        merge(arr, l, medium, r);

    }

    public void merge(int[] arr, int l, int m, int r){
        int[] temp1 = new int[m-l+1];
        int[] temp2 = new int[r-m];

        for (int i=0;i<m-l+1; i++){
            temp1[i] = arr [l+i];

        }
        for (int i=0;i<r-m; i++){
            temp2[i] = arr[i+m+1];

        }

        int position = l;
        int temp1index = 0;
        int temp2index = 0;
        while(temp1index < m-l+1 && temp2index < r-m){
            if(temp1[temp1index] < temp2[temp2index]){
                arr[position] = temp1[temp1index];

                temp1index++;
            }
            else{
                arr[position] = temp2[temp2index];
                temp2index++;
            }
            position++;
        }

        //some already ordered could be not copied (because of the && in the while)
        while(temp1index < m-l+1){
            arr[position] = temp1[temp1index];
            temp1index++;
            position++;
        }

        while(temp2index < r-m){
            arr[position] = temp2[temp2index];
            temp2index++;
            position++;
        }
    }

}
