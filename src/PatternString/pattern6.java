package PatternString;
 //           *
//           * *
//          *  * *
//         * *  *  *
//           * * *
 //            * *
 //             *

public class pattern6 {

     public static void main(String[] args) {
         pattern2(5);
     }

    static void pattern2(int n){
        for(int row=0; row< 2*n; row++){

            int totalcolumninRow=row>n ? 2*n-row  : row;     //skip the first row -0 false bcz 0<0
             int noOfspaces= n-totalcolumninRow;
             for(int s=0; s<noOfspaces; s++){
                 System.out.print(" ");
             }
            for( int col=0; col<totalcolumninRow; col++){           /// 2*n-row -1 and col<= totalnuocolinroe
                System.out.print(" *");
            }                                          // we need to add new line  for each row
            System.out.println();
        }
    }
}
