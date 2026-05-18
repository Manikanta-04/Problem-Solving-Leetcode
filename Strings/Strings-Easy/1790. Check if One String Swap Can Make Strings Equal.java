class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
     if(s1.equals(s2)) return true;
     int n=s1.length(),m=s2.length();
    List<Integer> res=new ArrayList<>();
    for(int i=0;i<n;i++){
        if(s1.charAt(i)!=s2.charAt(i)) res.add(i);
        if(res.size()>2) return false;
    }
    int i=res.get(0);
    int j=res.get(1);
     return s1.charAt(i)==s2.charAt(j) && s1.charAt(j)==s2.charAt(i);
    }
}