class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       List<List<Integer>> res=new ArrayList<>();
       List<Integer> temp=new ArrayList<>();
       List<Integer> t=new ArrayList<>();
       HashSet<Integer> set1=new HashSet<>();
       HashSet<Integer> set2=new HashSet<>();
       for(int i : nums1){
        set1.add(i);
       }
       for(int i : nums2){
        set2.add(i);
       }
       for(int i : set1){
       if(!set2.contains(i)) t.add(i);
       }
       res.add(t);
       for(int i : set2){
       if(!set1.contains(i)) temp.add(i);
       }
       res.add(temp);  
    return res;
    }
}