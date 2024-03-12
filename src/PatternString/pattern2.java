package PatternString;
//
//  ****
//  ****
//  ****
//  ****
public class pattern2 {

    public static void main(String[] args) {
        pattern2(4);
    }

    static void pattern2(int n){
        for(int row=0; row<n; row++){
                                                           // for every row  , run the col
            for( int col =0; col<n; col++){
                System.out.print("* ");
            }                                          // we need to add new line  for each row
            System.out.println();
        }
    }
}
