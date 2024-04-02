package RecursionProblems.Easy;

public class DIgitProduct {
    public static void main(String[] args) {
        int ans= Product(1234);
        System.out.println(ans);
    }
    static  int Product(int n){
        if( n %10 == n){      // last digit ==n i.e single digit
            return  1;
        }

        return  (n % 10) * Product (n/10);
    }
}
