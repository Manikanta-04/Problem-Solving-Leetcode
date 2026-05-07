class Solution {

    public int[] maxValue(int[] nums) {

        int n = nums.length;

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            boolean[] vis = new boolean[n];

            ans[i] = dfs(i, nums, vis);
        }

        return ans;
    }

    public int dfs(int i, int[] nums, boolean[] vis) {

        vis[i] = true;

        int maxi = nums[i];

        // Right jumps
        for (int j = i + 1; j < nums.length; j++) {

            if (!vis[j] && nums[j] < nums[i]) {

                maxi = Math.max(maxi,
                        dfs(j, nums, vis));
            }
        }

        // Left jumps
        for (int j = i - 1; j >= 0; j--) {

            if (!vis[j] && nums[j] > nums[i]) {

                maxi = Math.max(maxi,
                        dfs(j, nums, vis));
            }
        }

        return maxi;
    }
}