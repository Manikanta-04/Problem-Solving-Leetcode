class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int n=nums1.length,m=nums2.length;
     double [] ans=new double[n+m];
     int i=0,j=0;
     int k=0;
     while(i<n && j<m){
        if(nums1[i]<nums2[j]) ans[k++]=nums1[i++];
        else ans[k++]=nums2[j++];
     }
     while(i<n){
        ans[k++]=nums1[i++];
     }
     while(j<m){
        ans[k++]=nums2[j++];
     }
     int r=n+m;
     if(r%2==0){
        return (ans[r/2]+ans[(r/2)-1])/2;
     }
     return ans[r/2];  
    }
}