package RecursionProblems.Easy;

//num =14
//op =6

//1.  14 even %2  ==7
// 2.  7 odd sub -1  == 6
// etc
//6. 1 odd  sub -1  obtain ==0
//ans == no. step 6

public class NumberStepReduceZero {
    public static void main(String[] args) {
        System.out.println(numberofstep(14));
    }
    static  int numberofstep(int num){
        return  helper(num, 0);
    }

    private static int helper(int n, int step) {

        if(n == 0){
            return  step;
        }
        if( n% 2 ==0){
             return  helper( n /2, step+1);

        }
        return  helper(n - 1, step +1);
    }
}
