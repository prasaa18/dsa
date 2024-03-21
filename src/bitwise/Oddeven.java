package bitwise;
 // 100101
//& 000001    == 000001  --1 --odd else 0-- even
public class Oddeven {
    public static void main(String[] args) {
        int n=67;
        System.out.println(isodd(n));
    }

    private static boolean isodd(int n) {

        return  (n&1)==1;
    }
}
