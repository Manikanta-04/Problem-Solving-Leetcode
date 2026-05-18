class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
         int n = nums.length;

        int ml = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] % 2 != 0 || nums[i] > threshold) {
                continue;
            }

            ml = Math.max(ml, 1);

            boolean valid = true;

            for (int j = i; j < n - 1; j++) {

                if (nums[j + 1] > threshold ||
                    nums[j] % 2 == nums[j + 1] % 2) {

                    valid = false;

                    break;
                }
                ml = Math.max(ml, (j + 1) - i + 1);
            }
        }

        return ml;
    }
}