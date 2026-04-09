class Solution {
    boolean possible(int[] bloomDay, int day, int m, int k) {
        int count = 0, bouquets = 0;
        for (int b : bloomDay) {
            if (b <= day) {
                count++;
                if (count == k) {
                    bouquets++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }
        return bouquets >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if ((long)m * k > n) return -1;
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for (int b : bloomDay) {
            low = Math.min(low, b);
            high = Math.max(high, b);
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(bloomDay, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}