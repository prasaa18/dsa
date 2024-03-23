package bitwise;
 ////  1== 001 == 5^0*1= 5
/// 4 =  100 =1*5^3 =125
// n&1 == lastdigit  of number  n=6 110 = n&1= 0
// n>>1 == 11 next  digit  11&1= 1
public class MagicNo {

     public static void main(String[] args) {
         int  n=6;
         int  ans=0;
         int base=5;

         while(n > 0){

             int last = n & 1;   // give last digit always  // llop n=1 0001
             n = n >> 1;         //reduce the bits by each time 1 irghtshift
             ans = ans + last * base;   //0*5+0=5  ,
             base = base * 5;             // 5*5 =25  25 *1+0 =25
         }
     }
}
