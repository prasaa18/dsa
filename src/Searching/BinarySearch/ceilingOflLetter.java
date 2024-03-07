package Searching.BinarySearch;

public class ceilingOflLetter {

    public static void main(String[] args) {
        char[] letter= {'a','f','g','z'};           // i/p and o/p   b= f , i= z , z= a,

        System.out.println(ceilingOfletter(letter,'K'));
    }
    static char  ceilingOfletter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //int mid=(start+end) //if lasrge exceds int value

            //but what if target is grater than greates number in the array


            int mid = start + (end - start) / 2;


            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];     //2%4 =1
    }
}
