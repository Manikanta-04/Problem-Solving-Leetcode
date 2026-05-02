class Solution {
    public int[] nextGreaterElements(int[] nums) {
      int n=nums.length;
      int[] res =new int[n];
      for(int i=0;i<n;i++){
         int c=0;
        for(int j=i+1;j<i+n;j++){
            int ind=j%n;
            if(nums[ind]>nums[i]){
                res[i]=nums[ind];
                c++;
                break;
            }
        }
         if(c==0) res[i]=-1;
      }
      return res;  
    }
}