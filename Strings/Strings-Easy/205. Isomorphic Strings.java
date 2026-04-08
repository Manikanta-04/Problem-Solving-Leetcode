class Solution {
    public boolean isIsomorphic(String s, String t) {
      if(s.length()!=t.length()) return false;
      HashMap<Character,Character> map1=new HashMap<>();
      for(int i=0;i<s.length();i++){
        char o=s.charAt(i);
        char r=t.charAt(i);
        if(!map1.containsKey(o)){
            if(!map1.containsValue(r)) map1.put(o,r);
            else return false;
        }
        else {
            char mc=map1.get(o);
            if(mc!=r) return false;
        }
      }
      return true;  
    }
}