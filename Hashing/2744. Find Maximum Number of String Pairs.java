class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int cnt = 0;

        for (String word : words) {
            String rev = new StringBuilder(word).reverse().toString();

            if (set.contains(rev)) {
                cnt++;
            } else {
                set.add(word);
            }
        }

        return cnt;
    }
}