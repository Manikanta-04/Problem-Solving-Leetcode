class Solution {
    boolean ispal(String s,int l,int r){
        if(l>=r) return true;
        while (l < r && !Character.isLetterOrDigit(s.charAt(l))) l++;
        // Skip non-alphanumeric from right
        while (l < r && !Character.isLetterOrDigit(s.charAt(r))) r--;
        if(s.charAt(l)!=s.charAt(r)) return false;
        return ispal(s,l+1,r-1);
    }
    public boolean isPalindrome(String s) {
        int n=s.length();
        if(n==0 || n==1) return true;
        s=s.toLowerCase();
        if(ispal(s,0,n-1))  return true;
        return false;
    }
}