package Recursion;

public class fibonacciRecursion {
    public static void main(String[] args) {
        System.out.println(   fibo(4));
        System.out.println(fiboFormula(50)); //jsut demo use long instead ans will be in long
    }

    static int  fiboFormula(int n){
        //return  (int)(( Math.pow(((1+Math.sqrt(5))/2),n) - (Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
      //remove less dominating

        return  (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
    static  int fibo(int n){
           // base condtion

        if(n<2){
            return  n;
        }

        return fibo(n-1)+fibo(n-2);  //here waiting for addittion no tail recursion
    }
}
