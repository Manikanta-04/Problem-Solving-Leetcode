class Solution {
    public static int countDigits(int n) {
        int count = 0;

        while (n > 0) {
            n = n / 10;  // remove last digit
            count++;
        }

        return count;
    }
}