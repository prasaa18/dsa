package Searching.linearSearch;

public class minMumNumberArray {
    public static void main(String[] args) {
        int a[] ={1, 2, 4 ,-2,-5,56};
        System.out.println(minNumb(a));
    }

    private static int  minNumb(int[] a) {
        int min=a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]<min){
                min=a[i];
            }
        }

        return  min;
    }
}
