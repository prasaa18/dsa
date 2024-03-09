package Sorting.CyclicSort;

import java.util.Arrays;

// i/p num= {1,2,,2,4} o/p=[2,3]
//find no that occurs twice and the thst is missing
public class setMissMatch6 {

    public static void main(String[] args) {
       int [] num= {1,2,2,4};
        int [] ans=setMissmatch(num);
        System.out.println(Arrays.toString(ans));
    }

    private static int[]setMissmatch(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i]-1;  //4
            if (arr[i] != arr[correctIndex]) {   // 8<8  false skip that   //3!=2
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        ///search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] !=index+1) {
                return new int[] {arr[index], index+1};      //dupliacte , missing no
            }
        }
        //case 2
        return new int[]{-1,-1};  //else ans 8
    }

    private static void swap(int[] a, int i, int correctIndex) {
        int temp  = a[i];
        a[i] = a[correctIndex];
        a[correctIndex] = temp;
    }
}
