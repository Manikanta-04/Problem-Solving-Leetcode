class Solution {
    public boolean check(int[] nums) {
        int c=0;
        int n=nums.length;
        if(n==0 || n==1){
            return true;
        }
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                c++;
            }
        }
        if(nums[n-1]>nums[0]){
            c++;
        }
        if(c>1){
            return false;
        }
        return true;
        
    }
}