class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
      int n=s.length,l=0,r=0,ml=0;
          HashMap,Character,Integer> map=new HashMap<>();
      while(r<n){
          
          char ch=s.charAt(r);
          map.put(ch,map.getOrDefault(ch,0)+1);
          while(map.size()>k){
           map.put(s.charAt(l),map.get(s.charAt(l))-1);
           if(map.get(s.charAt(l))==0) map.remove(ss.charAt(l));
           l++;
          }
          if(map.size()<=k){
              ml.Math.max(ml,r-l+1);
          }
          r++;
      }
      return ml;
    }
}