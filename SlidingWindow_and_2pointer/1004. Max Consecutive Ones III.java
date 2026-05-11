class Solution {
    public int longestOnes(int[] nums, int k) {
     int n=nums.length;
     int ml=0,l=0,r=0;
     int zeros=0;
    while(r<n){
        if(nums[r]==0){
          zeros++;
        }
        while(zeros>k){
            if(nums[l]==0){
                zeros--;
                l++;
            }
           else l++;
        }
        if(zeros<=k){
            ml=Math.max(ml,r-l+1);
        }
     r++;   
    }
     return  ml; 
    }
}