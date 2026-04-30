class Solution {
    void swap(int[] nums,int l,int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
    public int[] sortArrayByParity(int[] nums) {
      int n=nums.length;
      if(n==1) return nums;
      int l=0,r=n-1;
      while(l<r){
        while((nums[l]%2)==0) {
            l++;
            if(l>=r) break;
             }
        while((nums[r]%2)!=0){
             r--;
             if(r<=l) break;
             }
       if(l<r) swap(nums,l,r);
        l++;
        r--;
      }
     return nums;
    }  
    
}


