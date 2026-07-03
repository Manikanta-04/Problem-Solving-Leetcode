class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
       int samenum=10,m1=10,m2=10;
       HashSet<Integer> set1=new HashSet<>();
       HashSet<Integer> set2=new HashSet<>();
       for(int i : nums1){
        m1=Math.min(m1,i);
        set1.add(i);
       }
        for(int i : nums2){
        m2=Math.min(m2,i);
        set2.add(i);
       }
       for(int k :set1){
        if(set2.contains(k)){
            samenum=Math.min(samenum,k);
        }
       }
       if(samenum!=10) return samenum;
       if(m1<m2) return (m1*10)+m2;
       return (m2*10)+m1;
    }
}