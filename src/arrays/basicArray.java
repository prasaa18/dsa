package arrays;

import java.net.SocketOption;
import java.util.Arrays;
import java.util.Scanner;

public class basicArray {
    public static void main(String[] args) {
       // char [] rno= new char[5];
       // int [] rnos ={14};
       // System.out.println(rno[0]);


        Scanner sc = new Scanner(System.in);
 /// arrary of primitives
//        int [] a= new int [2];
//        for(int i =0; i<a.length; i++){
//            a[i]= sc.nextInt();
//            System.out.println(a[i]);
//        }
//
//        System.out.println(Arrays.toString(a));
//         for (int n:a){
//             System.out.println(n);
//         }



         //array of Objects
//        String [] str =new String[2];
//        for (int i =0; i<str.length; i++){
//            str[i]=sc.nextLine();
//        }
//
//        System.out.println(Arrays.toString(str));
//         for(String s :str){
//
//             System.out.println(s);
//         }

//mutablity array
        int [] a= {2, 3, 4};
        change(a);
        System.out.println(Arrays.toString(a));

    }

    private static void change(int[] a) {
        a[0]=90;

    }
}
