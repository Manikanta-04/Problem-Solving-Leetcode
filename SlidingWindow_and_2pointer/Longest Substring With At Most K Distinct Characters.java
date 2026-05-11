import java.util.HashMap;

class Solution {

    public int lengthOfLongestSubstringKDistinct(String s, int k) {

        int n = s.length();

        int maxLen = 0, l = 0, r = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        while (r < n) {

            char ch = s.charAt(r);

            // add current character
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // shrink window if distinct chars > k
            while (map.size() > k) {

                char leftChar = s.charAt(l);

                map.put(leftChar, map.get(leftChar) - 1);

                // remove if frequency becomes 0
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                l++;
            }

            // update answer
            maxLen = Math.max(maxLen, r - l + 1);

            r++;
        }

        return maxLen;
    }
}