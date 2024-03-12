package PatternString;
// 4 4 4 4 4 4 4
// 4 3 3 3 3 3 4
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4                // 4 corner wall
public class pattern9 {

     public static void main(String[] args) {

         pattern2(5);
     }

    static void pattern2(int n){
        int originalN=n;
           n=2*n-1;
        for(int row=0; row<n; row++){                   ///2*n-1 for all we can use akso 2*n for readbility

            for( int col=0; col<n; col++){

                int atEveryIndex =originalN-Math.min(Math.min(row,col),Math.min(n-row, n-col));      /// 2*n-row -1 and col<= totalnuocolinroe

                System.out.print(atEveryIndex+" ");
            }                                       // we need to add new line  for each row
            System.out.println();
        }
    }
}
