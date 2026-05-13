import java.util.HashMap;

class Solution {

    public int lengthOfLongestSubstringKDistinct(String s, int k) {

        int n = s.length();
        int maxLen = 0;

        // starting index
        for (int i = 0; i < n; i++) {

            HashMap<Character, Integer> map = new HashMap<>();

            // ending index
            for (int j = i; j < n; j++) {

                char ch = s.charAt(j);

                // increase frequency
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                // valid substring
                if (map.size() <= k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }

                // more than k distinct characters
                else {
                    break;
                }
            }
        }

        return maxLen;
    }
}