class Solution {
    public int characterReplacement(String s, int k) {

        int n = s.length();
        int ml = 0;

        for(int i = 0; i < n; i++) {

            HashMap<Character,Integer> map1 = new HashMap<>();
            int maxFreq = 0;

            for(int j = i; j < n; j++) {

                char ch = s.charAt(j);

                map1.put(ch,
                         map1.getOrDefault(ch,0) + 1);

                // track highest frequency
                maxFreq = Math.max(maxFreq,
                                   map1.get(ch));

                int len = j - i + 1;

                // replacements needed
                int changes = len - maxFreq;

                if(changes <= k) {
                    ml = Math.max(ml, len);
                }
            }
        }

        return ml;
    }
}