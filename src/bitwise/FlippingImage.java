package bitwise;
//       i/p  [[1, 1 ,0] , [1,0,1],[0,0,0]]

import java.util.Arrays;

/// horizontally reverse first  [[1,0,0],[0,1,0],[1,1,1]]
// inverst image      [[0,1,1],[1,0,1],[0,0,0]]
//o/p  [[1,0,0],[0,1,0],[0,0,0]
public class FlippingImage {

    public static void main(String[] args) {

        int arr [][] = {{1, 1 ,0}, {1,0,1},{0,0,0}};
           flipAndInvertImage(arr);
           System.out.println(Arrays.toString(arr));

        for(int row=0; row< arr.length ; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
    public static void flipAndInvertImage(int[][]image){
         for(int[] row :image){
             //revrse array
             for(int i=0; i< (image[0].length+1)/2; i++){
                 //swap
                 int temp =row[i] ^ 1;              /// xor heree only insrtaed of reverse and doing xor
                 row[i]= row[image[0].length-i-1] ^ 1;
                 row[image[0].length-i-1]=temp;
             }
         }

    }
}
