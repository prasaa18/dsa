package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {

/*
123
455
675
 */
        Scanner s =new Scanner(System.in) ;
        int [][] arr= new int[3][2];
        int[][] arr1={
                {1,2,3}, //0th index
                {12,22},// first index
                {13,29,30, 89}  }; //3rd index  arra [2][1]= 29

        for(int row =0; row<arr.length; row++){
            for( int col=0; col< arr1[row].length; col++) {
                System.out.println(arr1[row][col] +" ");

            }
        }
        //input
        for(int row =0; row<arr.length; row++){
             for( int col=0; col< arr[row].length; col++) {
                 arr[row][col] = s.nextInt();

             }
        }



        System.out.println(Arrays.toString(arr));
//        for(int row =0; row<arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]+" ");
//
//            }
//            System.out.println();
//        }
        for(int row=0; row< arr.length ; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        //enhanced for loop
                for(int [] a: arr){
                    System.out.println(a);
        }
    }
}
