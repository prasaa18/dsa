package ArrayList;

import java.util.ArrayList;

public class basic {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>(10);
        li.add(1);
        li.add(2);
        System.out.println(li);
        for(int l:li){
            System.out.println(l);       //li.get(i).add(in.nextInt())   to fetch user input

        }
        for( int i=0;i<li.size(); i++){
            System.out.println(li.get(i));
        }



    }
}
