package Searching.BinarySearch;
//find in Mountain array
//given in arr find peak ele and returns its index   if arry conatins multiple pee
// return the index to any of the peek
//in a={1,2,3,,1}  o/p   2   // 3 is peek ele
public class FindInMountainAray {
    public static void main(String[] args) {
        int []a={0,1,0};
        int ans = peakIndexMountainArray(a);
        System.out.println(ans);
    }

    public static int peakIndexMountainArray(int[] arr){
        int start =0;
        int end =arr.length-1;

        while(start<end){

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

        //in the end start === end and pointing to the largest number of the 2 checks
        //start edn are a;ways trying to find max elemnt in the above 2 checks
        //hence they are pointing to just one elethat is maxmum
        //mor elb: at evry point of time for start and end they have the best possible answer till that time
        // and if we are saying that only oone item remaining hence bcz of above line  that is best possible answer
        return start; // return end as both are equal;
    }
}
