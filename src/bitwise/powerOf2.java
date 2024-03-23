package bitwise;

public class powerOf2 {
    public static void main(String[] args) {
        int n=16;  // n=0  it returns true fix it  n=0
        boolean ans=(n&(n-1))==0;
        System.out.println(ans);
    }
}





