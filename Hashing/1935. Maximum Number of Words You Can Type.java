class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
     HashSet<Character> set=new HashSet<>();
     int c=0;
     for(char ch : brokenLetters.toCharArray() ){
        set.add(ch);
     }
     String[] words=text.split(" ");
     for(String wo: words){
        boolean possible=true;
            for(char ch : wo.toCharArray()){
                if(set.contains(ch)){
                    possible=false;
                    break;
                }
            }
            if(possible) c++;
     }

     return c;
    }
}