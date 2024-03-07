package Searching.linearSearch;

public class maxWealth {
    public static void main(String[] args) {
        int[][] arr1={
                {1,2,3}, //0th index
                {12,22},// first index
                {13,29,30, 89}  };
        System.out.println(maximumWealth(arr1));
    }
    static int maximumWealth(int[][] accounts){
        int ans= Integer.MIN_VALUE;
        for(int person =0; person<accounts.length; person++){
            int  sum=0;
            for(int account=0; account<accounts[person].length; account++){
                 sum+=accounts[person][account];
            }
            if(sum>ans){
               ans=sum;

            }
        }
        return ans;
    }

}
