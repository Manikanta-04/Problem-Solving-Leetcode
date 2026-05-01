class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int[] ev=new int[n/2];
        int[] od=new int[n/2];
        int e=0,o=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0) ev[e++]=nums[i];
            else od[o++]=nums[i];
        }
        int l=0,r=0;
        for(int i=0;i<n;i++){
         if(i%2==0) nums[i]=ev[l++];       
          else nums[i]=od[r++];
        }
       return nums; 
    }
}