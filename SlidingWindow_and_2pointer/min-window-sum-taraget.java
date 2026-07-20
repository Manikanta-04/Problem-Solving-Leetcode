class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int mini=Integer.MAX_VALUE;
        int l=0,r=0,n=nums.length;;
        int s=0;
        while(r<n){
            s+=nums[r];
            while(s>=target){
                mini=Math.min(r-l+1,mini);
                s-=nums[l];
                l++;
            }
            r++;
        }
        return mini==Integer.MAX_VALUE?0:mini;   
    }
}