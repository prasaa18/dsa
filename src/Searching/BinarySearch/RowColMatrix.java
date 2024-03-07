package Searching.BinarySearch;

import java.util.Arrays;

public class RowColMatrix {

    //matrix sorted row swise and col wise
    public static void main(String[] args) {
        int[] [] a={
                { 10,20,30,40 },
                {15,25,35,45},
                {28,29,37,49}
        };
        System.out.println(Arrays.toString(serach(a,37)));
    }
    static int[] serach(int[] []matrix, int target){    
        int r=0;
        int c=matrix.length-1;
         while( r<matrix.length &&  c>=0){
             //check 3 cases
             if(matrix[r][c]==target){
             return  new int[]{r,c};
             }
             if(matrix[r][c]<target){
                 r++;
             }else {
                 c--;
             }
         }
         return  new int []{-1, -1};
    }
}
