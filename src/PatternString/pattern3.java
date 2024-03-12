package PatternString;
//
//  ****
//  ***
//  **
//  *

public class pattern3 {
    public static void main(String[] args)
        {
            pattern2(4);
        }
        static void pattern2(int n){
            for(int row=1; row<=n; row++){
                // for every row  , run the col
                for( int col=1; col<=n-row+1; col++){
                    System.out.print("* ");
                }                                          // we need to add new line  for each row
                System.out.println();
            }
        }
    }