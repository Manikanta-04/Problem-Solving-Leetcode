class Solution {
    public List<Integer> findAnagrams(String s, String p) {
      List<Integer> res=new ArrayList<>();
      int n=s.length();
      int m=p.length();
      if(m>n) return res;
      char[] a1=p.toCharArray();
      Arrays.sort(a1);
      for(int i=0;i<=n-m;i++){
      String sub=s.substring(i,i+m);
      char[] a2=sub.toCharArray();
      Arrays.sort(a2);
      if(Arrays.equals(a1,a2)) res.add(i);
      }
      return res;  
    }
}