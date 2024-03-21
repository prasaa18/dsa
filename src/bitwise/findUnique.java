package bitwise;
 // apply associate property
// xor all no i.e  2^3^3^4^2^6^4   i.e a^a= 0  and a^0= a   i. 3
//order doesnot matter
// xor wrks perfect with negative or positive no bcz negative no respresent in 2s copliment only bits are flip
public class findUnique {
    public static void main(String[] args) {
        int[] a={ 2,3,3,4,2,6,4};
        System.out.println(finUniqueno(a));
    }

    private static int finUniqueno(int[] a) {
        int unique=0;
        for(int n: a){
            unique^=n;
        }
        return unique;
    }
}
