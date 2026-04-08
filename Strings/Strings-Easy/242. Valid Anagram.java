class Solution {
    public boolean isAnagram(String s, String t) {
  
        if (s.length() != t.length()) return false;

        // Convert directly to char arrays
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        // SORT them so characters appear in the same order
        java.util.Arrays.sort(c1);
        java.util.Arrays.sort(c2);

        // Now compare the sorted versions
        return java.util.Arrays.equals(c1, c2);
    }
}


