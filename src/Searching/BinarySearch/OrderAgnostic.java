package Searching.BinarySearch;

public class OrderAgnostic {
    public static void main(String[] args) {
        //int [] a={ -25,-17,-12,0,1,2,3,4 , 5 ,8, 19 ,20};  ///sorted array
        int [] a={ 9, 7, 5, 0 ,-2, -5}; // decending
        int ans =orderAgnostic(a,-5);
        System.out.println(ans);
    }
    static int orderAgnostic(int[] a, int target){
        int start= 0;
        int end =a.length-1;
 //       boolean isAss;
//        if(a[start]<a[end]){
//            isAss=true;
//        }
//        else{
//            isAss=false;
//        }
        boolean isAss = a[start]<a[end];

        while(start<=end) {
            //int mid=(start+end) //if lasrge exceds int value

            int mid = start + (end - start) / 2;
            if (a[mid] == target) {
                return mid;
            }


            if (isAss) {
                if (target < a[mid]) {
                    end = mid - 1;
                } else if (target > a[mid]) {
                    start = mid + 1;
                }
            }
            else {                                             ///descendimg order
                if (target > a[mid]) {
                    end = mid - 1;
                } else if (target < a[mid]) {
                    start = mid + 1;
                }
            }
        }
        return  -1;

    }
}
