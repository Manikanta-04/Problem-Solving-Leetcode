class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set =new HashSet<>();
        for(int i : nums){
            if(i>0) set.add(i);
        }
        int ans=1;
        while(true){
            if(set.contains(ans)) ans++;
            else break;
        }
        return ans;

    }
}