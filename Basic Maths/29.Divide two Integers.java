class Solution {
    public int divide(int dividend, int divisor) {

        // Handle overflow before division
        if(dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        int ans = dividend / divisor;

        if(ans > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        else if(ans < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return ans;
    }
}