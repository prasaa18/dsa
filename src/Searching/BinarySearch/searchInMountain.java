package Searching.BinarySearch;
// serach in mountain arry
// arr={1,2,3,4,5,3,1] target=3   o/p 3 exit in arr at index = 2  and index = 5
// return min index which is 2

//arr={0,1,2,4,2,1} target =3
//o/p =-1  3 does not exst so retrun -1


    public class searchInMountain {
     public static void main(String[] args) {

        int[] a = {1,2,3,4,5,3,1};
          int ans= search(a, 3);
         System.out.println(ans);
       }

     public static int search( int [] arr  ,int target ){
        int peek =peekIndexMountainArray(arr);
        int firstTry= orderAgonsticBinarySearch(arr,target,0, peek);
        if(firstTry!=-1){
            return  firstTry;
        }
        //s try to erach in 2nd half
         return  orderAgonsticBinarySearch(arr, target,peek+1,arr.length-1);
     }


        static int  orderAgonsticBinarySearch(int[] a, int target, int start , int end){

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
    public static int peekIndexMountainArray(int[] arr){
        int start =0;
        int end =arr.length-1;

        while(start<end){  ///not returning ,id thats why  < not <=

            int mid=start +(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                //yo are decending  part of arry
                //this may be ans but look at left
                //this is why end !=mid -1;
                end =mid;
            }else {
                // you are in acending part of arry
                start =mid+1 ;  // becauee we know
            }
        }
        return start;
        //in the end start === end and pointing to the largest number of the 2 checks
        //start edn are a;ways trying to find max elemnt in the above 2 checks
        //hence they are pointing to just one elethat is maxmum
        //mor elb: at evry point of time for start and end they have the best possible answer till that time
        // and if we are saying that only oone item remaining hence bcz of above line  that is best possible answer
        // return end as both are equal;
    }
}
