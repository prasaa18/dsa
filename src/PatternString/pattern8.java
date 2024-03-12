package PatternString;
//// //       1
////        2 1 2
////      3 2 1 2 3
////    4 3 2 1 2 3 4
////  5 4 3 2 1 2 3 4 5
//      4 3 2 1 2 3 4
//        3 2 1 2 3
//           2 1 2
//             1
public class pattern8 {

     public static void main(String[] args) {

         pattern2(5);
     }

    static void pattern2(int n){
        for(int row=1; row<=2*n; row++){
           int c= row > n? 2*n -row : row;
            int noOfspaces= n-c;
            for(int s=0; s<noOfspaces; s++){
                System.out.print("  ");
            }

            for( int col=c; col>=1; col--){           /// 2*n-row -1 and col<= totalnuocolinroe
                System.out.print(col+ " ");
            }
            for( int col=2; col<=c; col++){           /// 2*n-row -1 and col<= totalnuocolinroe
                System.out.print(col +" ");
            }                                       // we need to add new line  for each row
            System.out.println();
        }
    }
}
