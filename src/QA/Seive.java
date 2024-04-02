package QA;
//similar as priemme under 40 check all prime in optimized way

// auxilary space o(n)
//time complexity o(N * LOG(LOG N)
public class Seive {

    public static void main(String[] args) {
         int n=40;
         boolean [] primes =new boolean[n+1];
        System.out.println(primes[0]);
          sieve(primes,n);
    }
     // intially false
    // false in array means number is prime   the make multiple of that no  to true
    static  void sieve(boolean [] prime , int n){
        for(int i= 2; i * i <= n; i++){

            if(!prime[i]){
                for(int j= i * 2; j <= n; j += i){   //2 +2  or 3+3 multile
                    prime[j] = true;

                }
            }
        }
        for(int i= 2; i <= n; i++){
            if(!prime[i]){
                System.out.print(i + " ");



            }
        }
    }
}
