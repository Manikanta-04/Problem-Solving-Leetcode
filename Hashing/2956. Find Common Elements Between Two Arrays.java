class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] ans=new int[2];
        int c1=0,c2=0;
        HashMap<Integer,Integer> m1=new HashMap<>();
        HashMap<Integer,Integer> m2=new HashMap<>();
        for(int i : nums1){
            m1.put(i,m1.getOrDefault(i,0)+1);
        }
        for(int i : nums2){
            m2.put(i,m2.getOrDefault(i,0)+1);
        }
        for(int i : nums1){
            if(m2.containsKey(i)) c1++;
        } 
          for(int i : nums2){
            if(m1.containsKey(i)) c2++;
        }
        ans[0]=c1;
        ans[1]=c2;
        return ans;       
    }
}