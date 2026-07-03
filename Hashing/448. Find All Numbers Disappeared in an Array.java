class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        List<Integer> res=new ArrayList<>();
        int n=nums.length;
        for(int i : nums){
            map1.put(i,1);
        }
        for(int i=1;i<=n;i++){
            if(!map1.containsKey(i)) res.add(i);
        }
        return res;    
    }
}