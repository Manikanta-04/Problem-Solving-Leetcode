class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<>();

        for(int i = nums.length - 1; i >= 0; i--){

            if(map.containsKey(nums[i])){

                ans.add(nums[i]);

                map.remove(nums[i]); 

                k--;

                if(k == 0){
                    break;
                }
            }
        }

        int[] res = new int[ans.size()];

        for(int i = 0; i < ans.size(); i++){
            res[i] = ans.get(i);
        }

        return res;  
    }
}