package bitwise;

public class ithBit {

    public static void main(String[] args) {
        int num=6;
        System.out.println(ithBitNo(num , 2));
    }

    private static int ithBitNo(int num,int  i) {
        return  num&(1<<(i-1));
    }
}
