class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map=new HashMap<>();
        String[] words=s1.split(" ");
         String[] words1=s2.split(" ");
        for(String s: words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s: words1){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        List<String> res=new ArrayList<>();
        for(String s: map.keySet()){
            if(map.get(s)==1) res.add(s);
        }
        String[] r=new String[res.size()];
        for(int i=0;i<res.size();i++){
            r[i]=res.get(i);
        }
        return r;
    }
}