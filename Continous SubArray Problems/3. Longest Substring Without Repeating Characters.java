class Solution {
    public int lengthOfLongestSubstring(String s) {
        char [] arr=s.toCharArray();
        int ml=0;
      int n=s.length();
      for(int i=0;i<n;i++){
       int hash[]=new int[256];
        for(int j=i;j<n;j++){
            if(hash[arr[j]]==1) break;
            ml=Math.max(ml,j-i+1);
            hash[arr[j]]=1;
        }
      }
      return ml;  
    }
}