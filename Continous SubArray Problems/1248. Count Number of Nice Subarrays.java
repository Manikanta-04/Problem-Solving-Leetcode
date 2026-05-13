class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
   int n=nums.length,cnt=0;     
    for(int i=0;i<n;i++){
        int odds=0;
        for(int j=i;j<n;j++){
            if(nums[j]%2!=0) odds++;
            if(odds>k) break;
            if(odds==k) cnt++;
        }
    }
    return cnt;
    }
}