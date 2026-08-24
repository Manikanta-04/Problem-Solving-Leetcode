class Solution {
    int[] dp;
    int solve(int i,int[] dp){
        if(i==0 || i==1) return dp[i];
        if(dp[i]!=-1) return dp[i];
        return solve(i-1,dp)+solve(i-2,dp);
    }
    public int fib(int n) {
        if(n==0 || n==1) return n;
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        return solve(n,dp);
    }
}