package Searching.BinarySearch;
//a ={3,4,5,6,0,1,2}  //  3         target =2
//a ={4,5,6,7,0,1,2,3} //pivot =4  targ= 6
//a ={5,6,7,1,2,3,4}  pivot =4          ///pviot =largest ele

//pivot not work for duplicate values
//rotate array = ascending sorted array  and rotedt at  pivot point
// pivot = largest ele at array
public class searchRotatedArray {

    public static void main(String[] args) {
        int []a ={3,4,5,6,1,2};
        System.out.println(findPivot(a));
        System.out.println( serach(a, 1));

    }

    public static int serach(int[] num, int target){
        int pivot =findPivot(num);
        //if did not find pivot arry not rotated
        if(pivot==-1){
            //just do normal binary serach
            return  binarySearch(num, target,0,num.length-1);

        }
        //if pivot found ypu have 2 acending sorted array
        if(num[pivot]==target){
            return  pivot;
        }
        if(target>=num[0]){
            return  binarySearch(num, target , 0,pivot-1);
        }
        return  binarySearch(num,target,pivot+1,num.length-1);
    }

///  this will not work in duplicate values
    //int []a ={3,4,5,6,1,2};
    static  int findPivot(int [] arr){
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
             if(arr[mid]<=arr[start]){
                 end =mid-1;         //ignore left all ele
             }
             else{
                 start =mid+1;         //ignore left all ele
             }
         }
         return  -1;
    }

    static int  binarySearch(int[] arr, int target ,int start , int end){


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
