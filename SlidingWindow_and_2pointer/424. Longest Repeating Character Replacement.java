class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length(),l=0,r=0,maxl=0,maxfreq=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(r<n){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxfreq=Math.max(maxfreq,map.get(ch));
            int changes=(r-l+1)-maxfreq;
            while(changes>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                maxfreq=0;
                for(char key : map.keySet()){
                    maxfreq=Math.max(maxfreq,map.get(key));
                }
                if(map.get(s.charAt(l))==0) map.remove(s.charAt(l));
                l++;
                changes=(r-l+1)-maxfreq;
            }
            if(changes<=k) maxl=Math.max(maxl,r-l+1);
            r++;
        }
        return maxl; 
    }
}