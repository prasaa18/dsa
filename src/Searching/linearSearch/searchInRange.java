package Searching.linearSearch;

public class searchInRange {
    public static void main(String[] args) {
       int [] a ={1, 2, 3, 4 ,-6 , -4 ,9};
        System.out.println(linearsearch(a, -22, 2,6));

    }

        static  int linearsearch(int [] arr, int target,int start, int end ){
            if (arr.length==0){
                return -1;
            }
            //run for loop
            for(int i=start; i<=end; i++){
                //check for element at every index if it is =target
                int element =arr[i];
                if(element==target){
                    return i;
                }
            }
            //may be -1  is the element thats why reurn Integr.max_value
            return Integer.MAX_VALUE;
        }

}
