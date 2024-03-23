package bitwise;
// a=3 b=9
 // f(b) ^f(a-1)
//
public class RangeXor {

    public static void main(String[] args) {
          //range xor for a, b = xor(b) ^ xor(a-1)
        int a= 3;
        int b= 9;

        int ans= xor(b) ^xor(a-1);
        System.out.println(ans);

        //only for check will give time exceeds for large number

        int ans2 =0;
        for(int i=0;i<=b; i++){
            ans2 = ans2 ^i;
        }
        System.out.println(ans2);
    }
    //this gie xor from o to a
    static  int xor(int a){
        if(a % 4 ==0){
            return  a;
        }
        if(a % 4 ==1){
            return  1;
        }
        if(a % 4 ==2){
            return  a+1;
        }
        if(a % 4 ==3){
            return  0;
        }
        return  0;
    }

}
