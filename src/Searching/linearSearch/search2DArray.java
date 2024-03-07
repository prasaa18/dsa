package Searching.linearSearch;

import java.util.Arrays;

public class search2DArray {
    public static void main(String[] args) {
        int[] [] a={
                { 23, 4, 1, },
                {2, 4, 5},
                {10, 38 , 4 , 5 , 6}
        };
        int targ=4;
         int [] ans= search2D(a, targ); // fprmat of return value {i,j}
       System.out.println(Arrays.toString(ans));
       // System.out.println(search2D(a, targ));
        System.out.println(max(a));
        System.out.println(maxEnhanced(a));
    }

    private static int[]  search2D(int[][] a, int targ) {
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                if(a[i][j]==targ){
                    return new  int[]{i, j}; //new to intialize the array of ans
                }
            }
        }
        return  new int[]{-1, -1};
    }
    private static int max(int[][] a) {
        int max=Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                if(a[i][j]>max){
                    max=a[i][j];

                }
            }
        }
        return  max;
    }
    private static int maxEnhanced(int[][] a) {
        int max=Integer.MIN_VALUE;
        for(int[] arr :a){     // evenry arrraof 2d integr array
            for(int anint:arr){     // in that it contains elements
                if(anint>max){
                   max=anint;

                }
            }
        }
        return  max;
    }
}
