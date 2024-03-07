package Searching.BinarySearch;

import java.util.Arrays;

public class FirstLastPostionSortedArray {

    public static void main(String[] args) {
        //find first and last postion  of ele in sorted array
        // i/p o/p [5,7,7,8,8,10]  target =8   o/p [3, 4]   else [-1 -1]
        int []a={5,7,7,8,8,10};
        int [] result= searchRange(a,7);
        System.out.println(Arrays.toString(result));

    }
        public  static int[] searchRange(int[] arr , int target ){

            int [] ans= {-1,-1};

            //check first occurance of target
            ans[0] =serach(arr, target,true);
            if(ans[0]!=0){
            ans[1] =serach(arr, target, false);
            }

            return  ans;
    }
    //this fun just returns idex value of target

    public static int serach(int [] arr, int target , boolean findfirstIndex){
          int ans= -1;
          int start= 0;
          int end =arr.length-1;
          while(start<=end) {
              //int mid=(start+end) //if lasrge exceds int value

              int mid = start + (end - start) / 2;


              if (target < arr[mid]) {
                  end = mid - 1;
              } else if (target > arr[mid]) {
                  start = mid + 1;
              } else {
                  // potentiakl answer
                  ans = mid;
                  if (findfirstIndex) {
                      end = mid - 1;
                  } else {
                      start = mid + 1;
                  }
              }


          }
        return ans;
    }
}
