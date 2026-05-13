class Solution {
    public int longestOnes(int[] nums, int k) {
     int n=nums.length;
     int ml=0;
     for(int i=0;i<n;i++){
        int c=0;
        for(int j=i;j<n;j++){
            if(nums[j]==0) c++;
            if(c<=k){
                ml=Math.max(ml,j-i+1);
            }
            else {
                break;
            }
        }
     }
     return  ml; 
    }
}