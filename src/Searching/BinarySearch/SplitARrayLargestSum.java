package Searching.BinarySearch;
//continous split array to find smallest in largest sum  in subarray
public class SplitARrayLargestSum {
    public static void main(String[] args) {
        int [] a={7,2,5,10,8};
        System.out.println(splitArray(a, 2));
    }

    public static int  splitArray(int[] num, int m){
        int start =0;
        int end=0;
        for(int i=0; i<num.length; i++){
            start =Math.max(start,num[i]);// in the end of the loop willcontain max item which is start of serch in other code
            end = end+num[i];   // total summ of  array
        }
        // binary serach
        while(start<end){
            //try for the middle as pottendtial ans
            int mid =start+(end-start)/2;
            // mid gives avg which means below that no of rang 10 to mid conains answer i,e smallest of largest su, aaray

            //calculate how many pieces you can divide in withis max sum
            int sum=0;
            int pieces=1;
            for(int nums: num){
                if(sum+nums >mid){
                    //you cannot add this in subarray make new one
                    //say you can add this no. in new sub array them sum =num
                    sum=nums;
                    pieces++;
                }else{
                    sum+=nums;
                }
            }

            if(pieces>m){
                start=mid+1;
            }else{             //reduce sum below mid i.e  pieces <=m
                end=mid;
            }
        }
        return  end;    // untill start ==end ==mid gives smallest no  of sum of largest array

    }
}
