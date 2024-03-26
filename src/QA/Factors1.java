package QA;

import java.util.ArrayList;

public class Factors1 {

    public static void main(String[] args) {
       factors3(20);
    }

    // o(n)
    static  void factors1(int n){
        for(int i=1; i<=n ; i++){
            if(n% i ==0){
                System.out.println( i+ " ");
            }
        }
    }


         // o(sqrt(n))
    static  void factors2(int n){
        for(int i=1; i<=Math.sqrt(n) ; i++){  //chekc till sqrt n

            if(n% i ==0){
                if(n/i == i){
                    System.out.print(i);   //ex 36 prints 2 time 6 and and 36/6 = 6 thats why this condtion
                }else {
                    System.out.print(i + " " + n / i + " ");   // ans 10 and 2 both  are divide number 20
                }
            }
        }
    }


    // both time and space will be O(sqrtn)

       // to sort then in acending order
    static  void factors3(int n){455555

        ArrayList<Integer> li= new ArrayList<>();

        for(int i=1; i<=Math.sqrt(n) ; i++){  //chekc till sqrt n

            if(n% i ==0){
                if(n/i == i){
                    System.out.print(i);   //ex 36 prints 2 time 6 and and 36/6 = 6 thats why this condtion
                }else {
                    System.out.print(i +  " ");   // ans 10 and 2 both  are divide number 20
                    li.add(n/i);     //stroring sqrt(n)/2n    ///  too sort the number in we create new arralist
                                                                   // and addthose othe decending no in arraylist
                }
            }
        }

        for( int i=li.size()-1; i>=0; i--){
            System.out.print(li.get(i)+ " ");
        }
    }
}
