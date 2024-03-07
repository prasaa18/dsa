package Searching.BinarySearch;

public class sortedArrayInfiniteNumber {

    ///[2, 3, 5, ,6,7, 8,10,11, 12, 15 , 18, 20, 23, 30]  logN step multiplying
    // start and end endex chunck in betwen target
    public static void main(String[] args) {
         int a[] = {2, 3, 5, 6,7, 8,10,11, 12, 15 , 18, 20, 23, 30};
        System.out.println(ans(a, 3));


    }

    static int ans(int [] a, int target){
        //first find the range
        // first start ith box 2
        int start =0;
        int end =1;
        //condition for target lie end range
        // to check the target > end then double the size
        while(target>a[end]){
            int newStart=end+1;
            //double the box value
            //end =  prvious end +size of box *2
             end= end+(end-start+1)*2;    //   i.e. 5= 1+ 2*(1-0+1) =5
            start =newStart;
        }
        return  binarySearchInfinite(a, target,start,end);
    }

    static int  binarySearchInfinite(int[] arr, int target, int start , int end){


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
