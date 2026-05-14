class Solution {
    static int solve(int bt[]) {
        // code here
         Arrays.sort(bt);
         int wt=0;
         int[] ans=new int[bt.length-1];
         for(int i=1;i<bt.length;i++){
             for(int j=0;j<i;j++){
              ans[i-1]+=bt[j];   
             }
         }
         for(int k : ans){
             wt+=k;
         }
         return wt/bt.length;
         
    }
}
