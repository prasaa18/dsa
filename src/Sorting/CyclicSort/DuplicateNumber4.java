package Sorting.CyclicSort;
// nums=[1,3,4,2,2]    [1,N] constant space complexity
// o/p=2
public class DuplicateNumber4 {
    public static void main(String[] args) {
   int [] n ={1,3,4,2,2};
        System.out.println(findDuplicate(n));
    }

    private static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int correctIndex = arr[i] - 1;//4-1 =3
                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                } else {
                    return arr[i]; //now it returns
                    //note: dupliate but in that ah index conatin missing also /  if returns i+1; then its missing number
                }

            }else{
                i++;
            }
        }
        return  -1;
    }
    //another way of returning dupliacte
//        for (int index = 0; index < arr.length; index++) {
//            if (arr[index] !=index+1) {
//                return arr[index];
//            }
//        }
//        //case 2
//        return -1;

    static void  swap(int[] a, int index1, int index2){
        int temp  = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;

    }
}
