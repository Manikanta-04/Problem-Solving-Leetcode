import java.util.HashMap;

class Solution {

    public int lengthOfLongestSubstringKDistinct(String s, int k) {

        int n = s.length();

        int ml = 0;

        for (int i = 0; i < n; i++) {

            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = i; j < n; j++) {

                char ch = s.charAt(j);

                map.put(ch, map.getOrDefault(ch, 0) + 1);

                if (map.size() > k) {
                    break;
                }
                else {
                    ml = Math.max(ml, j - i + 1);
                }
            }
        }

        return ml;
    }
}