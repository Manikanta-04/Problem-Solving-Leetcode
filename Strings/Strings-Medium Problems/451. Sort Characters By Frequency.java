class Solution {
    public String frequencySort(String s) {
       HashMap<Character,Integer> map1 = new HashMap<>();
       for(char c : s.toCharArray()){
        map1.put(c,map1.getOrDefault(c,0)+1);
       }
       List<Character> l1= new ArrayList<>(map1.keySet());
       Collections.sort(l1,(a,b)-> map1.get(b)-map1.get(a));
       StringBuilder sb=new StringBuilder();
       for(char ch : l1){
        int f=map1.get(ch);
        while(f>0){
            sb.append(ch);
            f--;
        }
       }
       return sb.toString();
    }
}