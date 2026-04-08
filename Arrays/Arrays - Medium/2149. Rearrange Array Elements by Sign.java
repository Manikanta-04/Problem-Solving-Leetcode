class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] pos=new int[n/2];
        int[] neg =new int[n/2];
        int po=0,ne=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos[po++]=nums[i];
            }
            else{
                neg[ne++]=nums[i];
            }
        }
        int i=0,j=0,k=0;
        while(i<n/2 && j < n/2){
            nums[k++]=pos[i++];
            nums[k++]=neg[j++];
        }
        return nums;
    }
}