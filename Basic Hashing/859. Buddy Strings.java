class Solution {
    public boolean buddyStrings(String s, String goal) {
       int n=s.length(),m=goal.length();
       if(n!=m) return false;
       int[] arr=new int[26];
       if(s.equals(goal)){
        for(char ch : s.toCharArray()){
            arr[ch-'a']++;
            if(arr[ch-'a']>1) return true;
        }
        return false;
       }
       List<Integer> l1=new ArrayList<>();
       for(int i=0;i<n;i++){
        if(s.charAt(i)!=goal.charAt(i)) l1.add(i);
       }
       if(l1.size()!=2) return false;
       int i=l1.get(0);
       int j=l1.get(1);
       return s.charAt(i)==goal.charAt(j) && s.charAt(j)==goal.charAt(i);
    }
}