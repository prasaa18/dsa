package QA;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 23, 4, 6, 65, 76};


        System.out.println(max(arr));

        System.out.println(maxRange(arr,3 ,4));

    }

    static int max(int[] a) {
        if(a.length==0){
            return  -1;
        }
        int maxi = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > maxi) {
                maxi = a[i];
            }


        }
        return maxi;
    }

    static int maxRange(int[] a , int start, int end) {
        if(end>start){
            return -1;
        }
        if(a==null){
            return -1;
        }
        int maxi = a[start];
        for (int i = start; i <=end; i++) {
            if (a[i] > maxi) {
                maxi = a[i];
            }


        }
        return maxi;
    }


}
