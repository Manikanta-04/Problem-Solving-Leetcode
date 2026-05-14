class Solution {
    static int solve(int bt[]) {
        // code here
         Arrays.sort(bt);
         int wt=0;
         int t=0;
         int n=bt.length;
         for(int i=0;i<n;i++){
             wt+=t;
             t+=bt[i];
         }
        
         return wt/bt.length;
         
    }
}
