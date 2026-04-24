class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n=nums.size();
        int pairs=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums.get(i)+nums.get(j)<target) pairs+=1;
            }
        }
        return pairs;
    }
}