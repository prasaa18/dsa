package RecursionProblems.Easy;
/// 3020  ans= 2
public class CountZeroesInNum {

    public static void main(String[] args) {
        System.out.println(count(12020));
    }
    static  int count(int n){
        return  helper(n ,0);  // nedt to pass value top in recusrion call thst why helper func used
    }

    private static  int helper(int n, int c){
        if(n==0){
            return  c;
        }
        int rem = n % 10 ;

        if(rem == 0){
            return  helper( n/10 , c+1);
        }
        return helper(n /10 , c);
    }
}
