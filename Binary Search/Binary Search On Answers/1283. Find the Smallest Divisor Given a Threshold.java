class Solution {
    int fun1(int[] nums,int mxdiv){
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=(int)Math.ceil((double)nums[i]/mxdiv);
        }
        return sum;
    }
    
    public int smallestDivisor(int[] nums, int threshold) {
        int maxi=nums[0];
     for(int i : nums){
            maxi=Math.max(maxi,i);
      } 
       int l=1,r=maxi;
       while (l<=r){
        int m=(l+r)/2;
            if(fun1(nums,m)<=threshold) r=m-1;
            else l=m+1;
       }
       return l;   
    }
}