package Sorting.BubleSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class basic {
    public static void main(String[] args) {
      int[] arr={5,4,3,2,1};
      bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //does not return amything spce complexity is 0(1) inspace  does not create new array orginal array sorted
    static void  bubbleSort(int[] arr){
        //  run the steps n-1 times
           boolean swappeed;
        for(int i=0;i<arr.length ; i++){
            swappeed=false;
            //for each step ,max item will come at the last respective index
            for(int j=1;j<arr.length-i; j++){   //or j<=arr,length-1-i ;
                //swap if the item is smaller than the previous item'
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp= arr[j];
                    arr[j] =arr[j-1];
                    arr[j-1]=temp;
                    swappeed=true;
                }
            }
            //for sorted array no swap occurs thats why take boolean vlue
            if(!swappeed){  // swapped =false   // !false  statement if =true
                break;                         //i=0 dont need to check for other value
            }
            //if you did not swap for a particular value of  i, it means array is sorted
            //hence top the program


        }
    }
}
