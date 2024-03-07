package Searching.linearSearch;

public class basic {
    public static void main(String[] args) {
            int [] num ={2,3,4,5,7 , -1 };
            int targ=-1;
            int ans=linearsearch(num,targ);
        System.out.println(ans);
    }
     //search in the array  : return index if item found or else  -1
    static  int linearsearch(int [] arr, int target ){
        if (arr.length==0){
            return -1;
        }
        //run for loop
        for(int i=0; i<arr.length; i++){
            //check for element at every index if it is =target
            int element =arr[i];
            if(element==target){
                return i;
            }
        }
        //may be -1  is the element thats why reurn Integr.max_value
        return Integer.MAX_VALUE;
    }
   ///search return enhanced loop
    static  int linearsearch2(int [] arr, int target ) {
        if (arr.length == 0) {
            return -1;
        }
        //run for loop
        for (int element : arr) {
            //check for element at every index if it is =target

            if (element == target) {
                return element;
            }
        }
        //if none of return execut ehence target not found
        return -1;
    }

    ///search return return true or false

    static  boolean linearsearch3(int [] arr, int target ) {
        if (arr.length == 0) {
            return false;
        }
        //run for loop
        for (int element : arr) {
            //check for element at every index if it is =target

            if (element == target) {
                return true;
            }
        }
        //if none of return execut ehence target not found
        return false;
    }
}
