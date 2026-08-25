int[] dp;

int fact(int n) {
    if (n == 0)
        return 1;

    if (dp[n] != 0)
        return dp[n];

    return dp[n] = n * fact(n - 1);
}