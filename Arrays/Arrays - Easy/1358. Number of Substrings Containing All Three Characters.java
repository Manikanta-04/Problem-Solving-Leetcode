class Solution {
    public int numberOfSubstrings(String s) {
     int c=0,n=s.length();
     for(int i=0;i<n;i++){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int j=i;j<n;j++){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.containsKey('a')&& map.containsKey('b') && map.containsKey('c')) {
                c+=n-j;
                break;
            }
        }
     }
     return c;   
    }
}