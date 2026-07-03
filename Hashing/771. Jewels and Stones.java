771. Jewels and Stonesclass Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map1=new HashMap<>();
        int cnt=0;
        for(char ch : stones.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<jewels.length();i++){
            char c=jewels.charAt(i);
            if(map1.containsKey(c)){
                cnt+=map1.get(c);
            }
        }
    return cnt;
    }
}