class Solution {
    public char findTheDifference(String s, String t) {
        int n=s.length();
        int m=n+1;
        if(n==0) return t.charAt(0);
        char[] sa=s.toCharArray();
        char[] ta=t.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(ta);
        char c=ta[n];
        for(int i=0;i<n;i++){
            if(sa[i]!=ta[i]) return ta[i];           
        }
        return c;
    }
}