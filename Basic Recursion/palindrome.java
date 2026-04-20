class Solution {
 boolean ispal(String s,int l){
    int n=s.length();
    if(l>=n/2) return true;
    if(s.charAt(l)!=s.charAt(n-l-1)) return false;
    return ispal(s,l+1);
 }
    public boolean isPalindrome(int x) {
       String s = String.valueOf(x);
       int i=0;
       if(ispal(s,i)) return true;
       return false;
    }
}