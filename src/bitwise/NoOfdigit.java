package bitwise;
// logb A= x     == log2(10) = 3.32
// 10 = 2^3.32
// 10  = int (3.32)+ 1=  4  = 1100


public class NoOfdigit {
    public static void main(String[] args) {

        int n = 34567;         // int n=10   int b=2   ans=4
        int b = 10;

        int ans= (int) (Math.log(n) / Math.log(b)) + 1;

        System.out.println(ans);
    }
}
