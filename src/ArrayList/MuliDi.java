package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MuliDi {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        ArrayList<ArrayList<Integer>> li =new ArrayList<>();


        for(int  i=0; i<3;i++){
            li.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                li.get(i).add(in.nextInt());

            }
        }
            System.out.println(li);

            for(int i=0; i<3;i++){
                System.out.println(li.get(i));
                li.get(i);
            }



    }
}
