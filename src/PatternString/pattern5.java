package PatternString;
//  *
//  **
//  ***
//  ****
//  *****
//  ****
//  ***
//  **
//  *


public class pattern5 {
    public static void main(String[] args)
        {
            pattern3(5);
        }
        static void pattern2(int n){
            for(int row=0; row< 2*n; row++){           //actuall 2n -1 but for readbilty used 2*n

                int totalcolumninRow=row>n ? 2*n-row  : row;     //skip the first row -0 false bcz 0<0

                for( int col=0; col<totalcolumninRow; col++){           /// 2*n-row -1 and col<= totalnuocolinroe
                    System.out.print(" *");
                }                                          // we need to add new line  for each row
                System.out.println();
            }
        }

    static void pattern3(int n){
        for(int row=1; row<=2*n; row++){

            int totalcolumninRow=row>=n ? 2*n-row  : row;

            for( int col=1; col<=totalcolumninRow; col++){
                System.out.print(" *");
            }                                          // we need to add new line  for each row
            System.out.println();
        }
    }
    }