package Searching.BinarySearch;

public class basic {

    public static void main(String[] args) {
        int [] a={ -25,-17,-12,0,1,2,3,4 , 5 ,8, 19 ,20};  ///sorted array
        int ans =binarySearch(a,-17);
        System.out.println(ans);
    }
    static int  binarySearch(int[] arr, int target){
        int start= 0;
        int end =arr.length-1;

        while(start<=end){
            //int mid=(start+end) //if lasrge exceds int value

            int mid = start + (end-start)/2;


            if(target < arr[mid]){
                end =mid -1;
            }else if(target>arr[mid]){
                start =mid+1;
            }
            else {
               return  mid;
            }
        }
        return  -1;
    }

}
