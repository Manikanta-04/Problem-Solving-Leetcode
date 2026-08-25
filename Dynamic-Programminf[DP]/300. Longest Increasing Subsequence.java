class Solution {

    int[][] dp;

    public int lengthOfLIS(int[] nums) {

        int n = nums.length;

        dp = new int[n][n + 1];

        for (int i = 0; i < n; i++) {
            java.util.Arrays.fill(dp[i], -1);
        }

        return solve(0, -1, nums);
    }

    int solve(int index, int prevIndex, int[] nums) {

        // Base case
        if (index == nums.length) {
            return 0;
        }

        // Already calculated
        if (dp[index][prevIndex + 1] != -1) {
            return dp[index][prevIndex + 1];
        }

        // Don't take current element
        int notTake = solve(index + 1, prevIndex, nums);

        // Take current element
        int take = 0;

        if (prevIndex == -1 || nums[index] > nums[prevIndex]) {
            take = 1 + solve(index + 1, index, nums);
        }

        return dp[index][prevIndex + 1] = Math.max(take, notTake);
    }
}