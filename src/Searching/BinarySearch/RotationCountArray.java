package Searching.BinarySearch;

public class RotationCountArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(countRotation(arr));
    }

    public  static int countRotation(int[] arr) {
      int pivot =findPivot(arr);
      if(pivot==-1){
          // array is not rotated
          return  0;
      }
      return  pivot+1;
    }

    //non dulicate
   public  static  int findPivot(int [] arr) {
       int start = 0;

       int end = arr.length - 1;
       while (start <= end) {
           int mid = start + (end - start) / 2;

           //4 cases
           if (mid < end && arr[mid] > arr[mid + 1]) {     // mid<end bcz index out if bound occur if mid+1 nnot there in that casw
               return mid;
           }
           if (mid > start && arr[mid] < arr[mid - 1]) {
               return mid - 1;
           }
           if (arr[mid] <= arr[start]) {
               end = mid - 1;         //ignore left all ele
           } else {
               start = mid + 1;         //ignore left all ele
           }
       }
       return -1;
   }
        //duplicate
        public static  int findPivotWithDuplicate(int [] arr){
        int  start =0;

        int end=arr.length-1;
        while(start<=end){
            int mid = start + (end - start) / 2;

            //4 cases
            if( mid <end && arr[mid]> arr[mid+1]){     // mid<end bcz index out if bound occur if mid+1 nnot there in that casw
                return mid;
            }
            if(mid >start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            // if  ele at middle , start and end are equal just skip the duplicates
            if(arr[mid]== arr[start] && arr[mid] ==arr[end]){
                //just skip the dupliactes

                //note: what if these ele at stat and end are pivot
                //chec if start is pivot


                // 2,9,2,2,2   ignore start and end ele i.e 9, 2, 2
                if(arr[start]> arr[start+1]){
                    return  start;
                }
                start++;
                //chkeck if end are pivot
                if(arr[end]<arr[end-1]){
                    return  end-1;
                }
                end--;
            }
            //left side is sorted , so  pivot is in the right
            //  {2,2,2,9,1} remove first last i,e 2, 2 9, 1     or another ex 2, ,2 9, 2
            else if(arr[start]<arr[mid] || arr[start]== arr[mid] && arr[mid] > arr[end]){
                start =mid+1;
            }else{
                end= mid-1;
            }
        }
        return  -1;
    }
}


