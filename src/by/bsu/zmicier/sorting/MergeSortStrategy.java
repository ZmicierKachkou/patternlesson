package by.bsu.zmicier.sorting;

public class MergeSortStrategy implements SortingStrategy {
    @Override
    public char[] sort(char[] array) {
        mergeSort(array);
        return array;
    }

    private static void merge(char[] left_arr,char[] right_arr, char[] arr,int left_size, int right_size){
        int i = 0;
        int l = 0;
        int r = 0;
        //The while loops check the conditions for merging
        while (l < left_size && r < right_size){

            if (left_arr[l] < right_arr[r]){
                arr[i++] = left_arr[l++];
            }
            else {
                arr[i++] = right_arr[r++];
            }
        }
        while (l < left_size){
            arr[i++] = left_arr[l++];
        }
        while (r < right_size){
            arr[i++] = right_arr[r++];
        }
    }

    private static void mergeSort(char [] arr) {

        int len = arr.length;
        if (len < 2){
            return;
        }

        int mid = len / 2;
        char [] left_arr = new char[mid];
        char [] right_arr = new char[len-mid];

        System.arraycopy(arr, 0, left_arr, 0, mid);
        System.arraycopy(arr, mid, right_arr, 0, len-mid);

        mergeSort(left_arr);
        mergeSort(right_arr);

        merge(left_arr,right_arr,arr,mid,len-mid);
    }
}
