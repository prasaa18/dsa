package Sorting.CyclicSort;

import java.util.Arrays;
  // ele start from [1,  N]
public class basicCyclic {
    public static void main(String[] args) {
        int[] arr={5,1,2,4,3};
       CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void CyclicSort(int[] arr) {
        int i=0;
        while(i<arr.length){

            int correctIndex= arr[i]-1;  //4-1 =3
            if(arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }

        }
    }
    static void  swap(int[] a, int index1, int index2){
        int temp  = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;

    }
}
