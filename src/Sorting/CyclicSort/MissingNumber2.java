package Sorting.CyclicSort;


// elestart from [0,N]
// given array conatin distinct array  [0,n]
 // number [3,0,1]   find missing number imt the range [0,3 ]  so o/p is =2   o(n) and o(n)

public class MissingNumber2 {
     public static void main(String[] args) {
         int[] arr={5,0,1,4,3};  //[0,N]

         System.out.println(CyclicSort(arr));
     }
     private static int CyclicSort(int[] arr) {
         int i = 0;
         while (i < arr.length) {
             int correctIndex = arr[i]-1;  //4
             if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {   // 8<8  false skip that   //3!=2
                 swap(arr, i, correctIndex);
             } else {
                 i++;
             }
         }
         ///search for first missing number
         for (int index = 0; index < arr.length; index++) {
             if (arr[index] !=index) {
                 return index;
             }
         }
         //case 2
         return arr.length;  //else ans 8
     }

    private static void swap(int[] a, int i, int correctIndex) {
        int temp  = a[i];
        a[i] = a[correctIndex];
        a[correctIndex] = temp;
    }
}
