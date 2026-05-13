class Solution {
    public int sumlessthangoal(int[] nums, int goal){
     int n=nums.length,cnt=0,l=0,r=0,sum=0;
           if(goal==0) return 0;
      while(r<n){
        sum+=nums[r];
        while(sum>=goal){
            sum-=nums[l];
            l++;
        }
        if(sum<goal)cnt+=(r-l+1);
        r++;
      }
      return cnt;    
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
      int n=nums.length,cnt=0,l=0,r=0,sum=0;
      while(r<n){
      sum+=nums[r];
        while(sum>goal){
            sum-=nums[l];
            l++;
        }
        if(sum<=goal)cnt+=(r-l+1);
        r++;
      }
      int total=cnt-sumlessthangoal(nums,goal);   
      return total;  
    }
}