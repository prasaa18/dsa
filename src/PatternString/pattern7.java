package PatternString;
// //       1
//        2 1 2
//      3 2 1 2 3
//    4 3 2 1 2 3 4
//  5 4 3 2 1 2 3 4 5

public class pattern7 {

     public static void main(String[] args) {

         pattern2(5);
     }

    static void pattern2(int n){
        for(int row=1; row<=n; row++){

            int noOfspaces= n-row;
            for(int s=0; s<noOfspaces; s++){
                System.out.print("  ");
            }

            for( int col=row; col>=1; col--){           /// 2*n-row -1 and col<= totalnuocolinroe
                System.out.print(col+ " ");
            }
            for( int col=2; col<=row; col++){           /// 2*n-row -1 and col<= totalnuocolinroe
                System.out.print(col +" ");
            }                                       // we need to add new line  for each row
            System.out.println();
        }
    }
}
