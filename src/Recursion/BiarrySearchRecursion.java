package Recursion;

public class BiarrySearchRecursion {

    public static void main(String[] args) {
        int a[]= {1,2,3,4,5,6};
        System.out.println(search(a,4, 0, a.length-1));
    }
    static  int search(int[]arr ,int target,int s, int e){
        if(s>e){
            return -1;
        }
        int m =  s+(e-s)/2 ;

        if(arr[m]==target){
            return  m;
        }
        if(target<arr[m]){
            return search(arr,target,s,m-1);
        }
        return search(arr,target,m+1, e);
    }
}
