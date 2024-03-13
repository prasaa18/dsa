package Recursion;
// write a function that takes ina a number and prints it
// print firest 5 umber  1 2 3 4 5
public class basic {
    public static void main(String[] args) {
         print3(1);
    }
//    static void print1(int n){
//        System.out.println(n);
//        print2(2);
//    }
//    static void print2(int n){
//        System.out.println(n);
//        print3(3);
//    }
//    static void print3(int n){
//        System.out.println(n);
//
//    }
           static void print3(int n){

               if(n==5){
                   System.out.println(5);
                   return;
               }
               System.out.println(n);
                   print3(n+1);//thios is called tail recursion

               }
}
