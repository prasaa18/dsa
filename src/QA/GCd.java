package QA;

public class GCd {

    public static void main(String[] args) {
        System.out.println(gcd(4,18));
    }
    static  int gcd(int a, int b){
        if( a== 0){
            return  b;


        }
        return  gcd(b%a , a);  //gcd(a,b)=gcd(rem(b,a),a)

    }
}
