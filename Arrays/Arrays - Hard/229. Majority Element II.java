class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> map1 =new HashMap<>();
        for(int i : nums){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        for(int key : map1.keySet()){
            if(map1.get(key)>n/3){
                res.add(key);
            }

        }
        return res;
    }
}