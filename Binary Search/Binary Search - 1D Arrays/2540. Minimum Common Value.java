class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
    int j=0;
    int n=nums2.length;
    for(int i : nums1){
       int l=0,r=n-1;
       while(l<=r){
        int m=l+(r-l)/2;
        if(i==nums2[m]) return nums2[m];
        else if(i>nums2[m]) l=m+1;
        else r=m-1;
       }
      }
     return -1; 
    }
}