class Solution {
    public int subarraylessthank(int[] nums, int k){
   int n=nums.length,cnt=0,l=0,r=0,odds=0;
   while(r<n){
    if(nums[r]%2!=0) odds++;
    while(odds>=k){
        if(nums[l]%2!=0) odds--;
        l++;
    }
    if(odds<k) cnt+=(r-l+1);
    r++;
   }
   return cnt;
}
    public int numberOfSubarrays(int[] nums, int k) {
   int n=nums.length,cnt=0,l=0,r=0,odds=0;
   while(r<n){
    if(nums[r]%2!=0) odds++;
    while(odds>k){
        if(nums[l]%2!=0) odds--;
        l++;
    }
    if(odds<=k) cnt+=(r-l+1);
    r++;
   }
   int total=cnt-subarraylessthank(nums,k);     
   return total;
    }
}