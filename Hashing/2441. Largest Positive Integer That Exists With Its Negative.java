class Solution {
    public int findMaxK(int[] nums) {
                Arrays.sort(nums);

                        HashMap<Integer,Integer> map = new HashMap<>();

                                for(int num : nums){
                                            map.put(num, 1);
                                                    }

                                                            for(int i = nums.length - 1; i >= 0; i--){

                                                                        if(nums[i] > 0 && map.containsKey(-nums[i])){
                                                                                        return nums[i];
                                                                                                    }
                                                                                                            }

                                                                                                                    return -1;
    }
}