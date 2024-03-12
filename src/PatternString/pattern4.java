package PatternString;
//
//  1
//  1 2
//  1 2 3
//  1 2 3 4
//  1 2 3 4  5

public class pattern4 {
    public static void main(String[] args)
        {
            pattern2(4);
        }
        static void pattern2(int n){
            for(int row=1; row<=n; row++){
                // for every row  , run the col
                for( int col=1; col<=row; col++){
                    System.out.print(col +" ");           //printing col number
                }                                          // we need to add new line  for each row
                System.out.println();
            }
        }
    }