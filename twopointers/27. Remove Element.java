class Solution {
    public int removeElement(int[] nums, int val) {
       int n=nums.length;
       int l=0,r=n-1;
       while(l<=r){
        while(l<=r && nums[l]!=val ) l++;
        while(l<=r && nums[r]==val ) r--;
        if(l<=r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
       }
       return l;
    }
}