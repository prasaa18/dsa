package Sorting.CyclicSort;

import java.util.ArrayList;
import java.util.List;

//[0,N]
//i/p num=[4,3,2,7,8,2,3,1,]  o/ [2,3]
public class AllNumberDiupplicatedInArray5 {

    public static void main(String[] args) {
     int [] num={4,3,2,7,8,2,3,1,};
        System.out.println(findDuplicate(num));

    }
        public static List<Integer> findDuplicate(int[] arr) {
            int i = 0;

            while (i < arr.length) {
                int correctIndex = arr[i]-1;  //4
                if (arr[i] != arr[correctIndex]) {   // 8<8  false skip that   //3!=2
                    swap(arr, i, correctIndex);
                } else {
                    i++;
                }
            }
            List<Integer> ans= new ArrayList<>();
            for(int index=0; index<arr.length; index++){
                if(arr[index]!=index+1){
                    ans.add(arr[index]);
                }
            }
            return  ans;
        }

        static void  swap(int[] a, int index1, int index2){
            int temp  = a[index1];
            a[index1] = a[index2];
            a[index2] = temp;

        }
}
