package Sorting.CyclicSort;
// missing smalleste postivie number
// i/p int []a ={1,2,0}    o/p = 3
//i/p= {3,4,-1,1}    o/p =2
// i/p {3,4,2,1} o/p =5  arr.length
public class MissingPositive {
    public static void main(String[] args) {
        int []a ={1,2,0};
        System.out.println(MissingPostive(a));
    }

    private static int MissingPostive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i]-1;
            if ( arr[i]>0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {  //ignore negavtive  and elemet>arr.legth
                swap(arr, i, correctIndex);                                         //  // 8<8  false skip that   //3!=2
            } else {
                i++;
            }
        }
        ///search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] !=index+1) {
                return index+1;
            }
        }
        return arr.length+1;    // {3,2,1,4} o/op 5 arr.legnth +1 [0,N]
    }

    private static void swap(int[] a, int i, int correctIndex) {
        int temp  = a[i];
        a[i] = a[correctIndex];
        a[correctIndex] = temp;
    }
}
