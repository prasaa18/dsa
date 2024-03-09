package Sorting.CyclicSort;

import java.util.ArrayList;
import java.util.List;

//[1,n]   find all missing no dissapered in array
// nums=[1,1]  o/p =[2]
//nums=[4,3,2,7,8,2,3,1] o/p=[5,6]
//asked in google
public class AllNumberDisaperedArray3 {

     public static void main(String[] args) {

             int[] arr={4,3,2,7,8,2,3,1};
         System.out.println(findMissingNumber(arr));

        }
        public static  List<Integer> findMissingNumber(int[] arr){
            int i = 0;
            while (i < arr.length) {
                int correctIndex = arr[i]-1;  //4
                if ( arr[i] != arr[correctIndex]) {   //3!=2
                    swap(arr, i, correctIndex);
                } else {
                    i++;
                }
            }
            ///just fid missing number    0=0+1=1
            List<Integer> ans= new ArrayList<> ();
            for(int index=0; index<arr.length; index++){
                if(arr[index]!=index+1){
                    ans.add(index+1);
                }
            }
            return  ans;
        }

        private static void swap(int[] a, int i, int correctIndex) {
            int temp  = a[i];
            a[i] = a[correctIndex];
            a[correctIndex] = temp;
        }
    }


