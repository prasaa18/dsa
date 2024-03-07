package Sorting.InsertionSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class basic {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void  insertion(int[] arr){

        for(int i=0; i<arr.length-1 ; i++){              //or <=arr.length-2
           for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp= arr[j];
                    arr[j] =arr[j-1];
                    arr[j-1]=temp;

                }
                else{
                    break;
                }
            }


        }
    }
//    static void  swap(int[] a, int index1, int index2){
//        int temp  = a[index1];
//        a[index1] = a[index2];
//        a[index2] = temp;
//
//    }
}
