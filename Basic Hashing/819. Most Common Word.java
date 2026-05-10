class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // store banned words
        HashSet<String> bannedSet = new HashSet<>();

        for (String word : banned) {
            bannedSet.add(word.toLowerCase());
        }

        // frequency map
        HashMap<String, Integer> map = new HashMap<>();

        paragraph = paragraph.toLowerCase();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < paragraph.length(); i++) {

            char ch = paragraph.charAt(i);

            // if alphabet → build word
            if (Character.isLetter(ch)) {
                sb.append(ch);
            }

            // word completed
            else {

                if (sb.length() > 0) {

                    String word = sb.toString();

                    // if not banned
                    if (!bannedSet.contains(word)) {
                        map.put(word, map.getOrDefault(word, 0) + 1);
                    }

                    // clear builder for next word
                    sb.setLength(0);
                }
            }
        }

        // handle last word
        if (sb.length() > 0) {

            String word = sb.toString();

            if (!bannedSet.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        // find max frequency word
        String ans = "";
        int max = 0;

        for (String word : map.keySet()) {

            if (map.get(word) > max) {
                max = map.get(word);
                ans = word;
            }
        }

        return ans;
    }
}   