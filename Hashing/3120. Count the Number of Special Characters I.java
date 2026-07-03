class Solution {
    public int numberOfSpecialChars(String word) {

        HashSet<Character> lower = new HashSet<>();
        HashSet<Character> upper = new HashSet<>();

        // store chars
        for(char ch : word.toCharArray()){

            if(Character.isLowerCase(ch)){
                lower.add(ch);
            }
            else{
                upper.add(ch);
            }
        }

        int cnt = 0;

        // check matching uppercase
        for(char ch : lower){

            if(upper.contains(Character.toUpperCase(ch))){
                cnt++;
            }
        }

        return cnt;
    }
}