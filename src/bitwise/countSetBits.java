package bitwise;
// 1001  = ans =2 setbits
public class countSetBits {

    public static void main(String[] args) {
        int n = 45;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBits(n));
    }

    //    private static int setBits(int n) {
//        int count=0;
//        while(n > 0){
//            count++;
//            n = n-(n&-n);
//        }
//        return  count;
//    }
    private static int setBits(int n) {
        int count = 0;

        while (n > 0) {
            count++;

            n = n & (n - 1);
        }
        return count;
    }
}
