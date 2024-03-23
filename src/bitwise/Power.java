package bitwise;
// 3^6=729
// a^b  // 3^110    // 110&1=0  ignore
// 110>>1 =11   11&1 =1   then rigtshift          base*base
 //11>>1 =1    1&1 =1    rightshit   1>>1 0      base*base
public class Power {

    public static void main(String[] args) {
        int base=3;
        int power = 6;
        int ans = 1;
        while(power > 0){
            if((power & 1) == 1){
                 ans= ans * base;

            }
            base =  base * base;
            power = power >> 1;

        }
        System.out.println(ans);
    }
}
