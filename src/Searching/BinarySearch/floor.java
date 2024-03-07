package Searching.BinarySearch;

public class floor {
    public static void main(String[] args) {
        int [] a={ -25,-17,-12,0,1,2,3,4 ,5 ,8, 19 ,20};
        System.out.println(Floor(a,15));
    }

    // greater element in array smaller or euqal to target  i.e floor of  7 is 5
    static int  Floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //int mid=(start+end) //if lasrge exceds int value

            int mid = start + (end - start) / 2;


            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
