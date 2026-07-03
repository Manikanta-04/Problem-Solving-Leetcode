class Solution {
    public int maxDifference(String s) {
      int[] freq=new int[26];
      int of=Integer.MIN_VALUE;
      int ef=Integer.MAX_VALUE;
      for(char ch : s.toCharArray()){
        freq[ch-'a']++;
      }
      for(int f : freq){
        if(f==0) continue;
        else if((f%2)!=0) of=Math.max(of,f);
        else  ef=Math.min(ef,f);
      }
      
      return of-ef;  
    }
}