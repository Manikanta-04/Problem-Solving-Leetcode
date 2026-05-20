import java.util.*;
//solving the problem using sliding window technique and hashset to keep track of unique characters in the current window
class Solution {
    public int lengthOfLongestSubstring(String s) {

        int l = 0;
        int r = 0;

        int maxLen = 0;

        HashSet<Character> set = new HashSet<>();

        while (r < s.length()) {

            char ch = s.charAt(r);

            // duplicate found
            while (set.contains(ch)) {
                set.remove(s.charAt(l));
                l++;
            }

            // add current character
            set.add(ch);

            // update max length
            maxLen = Math.max(maxLen, r - l + 1);

            r++;
        }

        return maxLen;
    }
}