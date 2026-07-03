class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
      int c=0;
      HashSet<Character> set=new HashSet<>();
      for(char ch : allowed.toCharArray()){
        set.add(ch);
      }
      for(String word : words){
            boolean check=true;
        for(char ch : word.toCharArray()){
            if(!set.contains(ch)){
                check=false;
                break;
            }
        }
        if(check) c++;
      }
      return c;  
    }
}