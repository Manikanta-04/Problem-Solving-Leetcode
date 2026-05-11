class Solution {
    public int numberOfSubstrings(String s) {
    int c=0,n=s.length();
    int l=0,r=0;
    HashMap<Character,Integer> map=new HashMap<>();
    while(r<n){
        char ch=s.charAt(r);
        map.put(ch,map.getOrDefault(ch,0)+1);
        while(map.containsKey('a') && map.containsKey('b') && map.containsKey('c')){
            c+=n-r;
            map.put(s.charAt(l),map.get(s.charAt(l))-1);
            if(map.get(s.charAt(l))==0) map.remove(s.charAt(l));
            l++;
        }
        r++;
    } 
     return c;   
    }
}