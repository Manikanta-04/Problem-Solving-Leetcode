
class Solution {

    int solve(int s, int e, int[] nums, int[] dp) {

        if (s > e)
            return 0;

        if (dp[s] != -1)
            return dp[s];

        int pick = nums[s] + solve(s + 2, e, nums, dp);

        int notPick = solve(s + 1, e, nums, dp);

        return dp[s] = Math.max(pick, notPick);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        solve(0, n - 2, nums, dp1);
        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        return Math.max(solve(0, n - 2, nums, dp1),solve(1, n - 1, nums, dp2));
    }
}