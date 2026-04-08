class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int m = (l + r) / 2;

            if (nums[m] > nums[m + 1]) {
                r = m;        // peak is on left side (including m)
            } else {
                l = m + 1;    // peak is on right side
            }
        }

        return l;   // or r (both same)
    }
} 