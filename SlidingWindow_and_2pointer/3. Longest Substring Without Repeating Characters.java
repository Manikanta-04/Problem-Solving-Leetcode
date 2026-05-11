class Solution {
    public int lengthOfLongestSubstring(String s) {
        char [] arr=s.toCharArray();
        int ml=0;
        int n=s.length();
        int l=0,r=0;
        int[] hash=new int[256];
        for(int i=0;i<256;i++){
            hash[i]=-1;
        }
        while(r<n){
            if(hash[arr[r]]!=-1){
                if(hash[arr[r]]>=l) l=hash[arr[r]]+1;
            }
            ml=Math.max(ml,r-l+1);
            hash[arr[r]]=r;
            r++;
        }
      return ml;  
    }
}