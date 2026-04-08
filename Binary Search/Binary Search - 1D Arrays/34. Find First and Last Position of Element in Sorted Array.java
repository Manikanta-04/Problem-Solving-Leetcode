class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lb = lowerBound(nums, target);
        int ub = upperBound(nums, target);

        // if target not present
        if (lb == nums.length || nums[lb] != target) {
            return new int[]{-1, -1};
        }

        return new int[]{lb, ub - 1};
    }

    // first index where nums[i] >= target
    private int lowerBound(int[] nums, int target) {
        int l = 0, r = nums.length;

        while (l < r) {
            int m = (l + r) / 2;

            if (nums[m] >= target) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        return l;
    }

    // first index where nums[i] > target
    private int upperBound(int[] nums, int target) {
        int l = 0, r = nums.length;

        while (l < r) {
            int m = (l + r) / 2;

            if (nums[m] > target) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        return l;
    }
}