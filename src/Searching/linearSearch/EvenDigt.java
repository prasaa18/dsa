package Searching.linearSearch;

import java.util.Map;

public class EvenDigt {
    public static void main(String[] args) {
        int [] num={12,345,2,6,7896};
        System.out.println(findNumber(num));
        //System.out.println(digit2(-2345));
    }
    static int findNumber(int[] nums){
       int count =0;
       for(int num:nums){
           if(even(num)){
               count++;
           }
       }
       return  count;

    }
    static  boolean even(int num){
        int noOfdigits=digits(num);
        if(noOfdigits%2==0){
            return  true;
        }
        return  false;            /// return noOfdigits %2 ==0
    }
    static int digits(int num){
        int count= 0;
        if(num<0){
            num= num*-1;
        }
        if(num== 0){
            return  1;
        }
        while(num>0){
            count++;
            num= num/10;

        }
        return count;

    }


    static int digit2(int num){

        if(num<0){
            num= num*-1;
        }
        if(num== 0){
            return  1;
        }
        return (int)(Math.log10(num))+1;
    }
}
