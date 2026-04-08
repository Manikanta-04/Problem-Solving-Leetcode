class Solution {
    public int findMin(int[] nums) {
      int min=Integer.MAX_VALUE;
      int n=nums.length;
     int l=0,r=n-1;
     while(l<=r){
        int m=(l+r)/2;
        if(nums[l]<=nums[m]){
        min=Math.min(min,nums[l]);
        l=m+1;
        }
        else if(nums[m]<=nums[r]){
            min=Math.min(min,nums[m]);
            r=m-1;
        }

        }

      return min;  
    }
}