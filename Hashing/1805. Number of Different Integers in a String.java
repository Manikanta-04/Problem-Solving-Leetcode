class Solution {
    public int numDifferentIntegers(String word) {

        HashSet<String> set = new HashSet<>();
        int n = word.length();
        int i = 0;

        while (i < n) {

            if (!Character.isDigit(word.charAt(i))) {
                i++;
                continue;
            }

            int start = i;

            while (i < n && Character.isDigit(word.charAt(i))) {
                i++;
            }

            String num = word.substring(start, i);
                        int j = 0;
            while (j < num.length() && num.charAt(j) == '0') {
                j++;
            }

            num = num.substring(j);

            if (num.length() == 0) {
                num = "0";
            }

            set.add(num);
        }

        return set.size();
    }
}