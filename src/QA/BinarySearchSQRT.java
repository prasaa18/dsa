package QA;
// time : o(log(n))
public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n=40;
        int p=3;     //prcision value

        System.out.printf(  " %.3f", sqrtNo( n, p)) ;

    }

    private static double sqrtNo(int n, int p) {
       int s=0;
       int e =n;
       double root =0.0;


       while(s <= e){

           int m = s + ( e -s ) / 2;

           if(m * m == n){
               return  m;
           }
           if(m * m > n){
               e = m - 1;
           }
           else {
               s = m + 1;
           }
       }
        double incr =0.1;
       for( int i =0 ;i < p; i++){
            while(root * root <= n){
                root += incr;              // till that number <= breaks when root *root  greater thatn that
            }

            root -= incr;  /// return to previous number  bcz root * root > n
            incr /= 10;  // run it for 2nd decimal place 0.01, 0.001 etc precison
         }
         return  root;

    }
}
