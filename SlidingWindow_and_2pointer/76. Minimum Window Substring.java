class Solution {
    public String minWindow(String s, String t) {
        int n=s.length(),m=t.length(),l=0,r=0,cnt=0;
        int ml=Integer.MAX_VALUE,si=-1;
        int[] hash=new int[256];
        for(char ch : t.toCharArray()){
            hash[ch]++;
        }
        while(r<n){
            char ch=s.charAt(r);
            if(hash[ch]>0) cnt++;
            hash[ch]--;
            while(cnt==m){
                if((r-l+1)<ml) {
                    ml=r-l+1;
                    si=l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)] > 0) cnt--;
                l++;
            }
            r++;
        }
        return (si==-1)?"":s.substring(si,si+ml);
    }
}