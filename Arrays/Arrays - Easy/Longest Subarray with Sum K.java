import java.util.*;

class Solution {
    public int longestSubarray(int[] arr, int k) {
        HashMap<Long, Integer> map = new HashMap<>();

        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Case 1: sum itself equals k
            if (sum == k) {
                maxLen = i + 1;
            }

            // Case 2: check if (sum - k) exists
            if (map.containsKey(sum - k)) {
                int len = i - map.get(sum - k);
                maxLen = Math.max(maxLen, len);
            }

            // Store first occurrence only
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}