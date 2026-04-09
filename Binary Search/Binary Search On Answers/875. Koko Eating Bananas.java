class Solution {

    int maximum(int[] piles) {
        int n = piles.length;
        int g = piles[0];
        
        for (int i = 1; i < n; i++) {
            if (piles[i] > g) g = piles[i];
        }
        return g;
    }

    long totalHours(int[] piles, int speed) {
        long total = 0;
        
        for (int i : piles) {
            total += (i + speed - 1) / speed; // ceil(i/speed)
        }
        return total;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = maximum(piles);

        while (l <= r) {
            int m = l + (r - l) / 2;
            
            long total = totalHours(piles, m);

            if (total <= h) {
                r = m - 1;  // try smaller speed
            } else {
                l = m + 1;  // need more speed
            }
        }
        return l;
    }
}