package Sorting.SelectionSort;


import java.lang.reflect.Array;
import java.util.Arrays;



public class basic {
    public static void main(String[] args) {
        int[] arr={  5,4,3,2,1};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void  SelectionSort(int[] arr){
        //  run the steps n-1 times

        for(int i=0;i<arr.length ; i++){

            //find the max item in the remaining array and swap with correct index
            int last =arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static void  swap(int[] a, int index1, int index2){
        int temp  = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;

    }
    private static int getMaxIndex(int[] arr, int start , int end) {
        int max=start;
        for(int i=start; i<=end; i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return  max;
    }
}
