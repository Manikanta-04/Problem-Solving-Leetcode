class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int l=0,r=0,ind=0;
       int [] res =new int[n+m];
       while(l<m && r <n){
        if(nums1[l]<nums2[r]){
            res[ind++]=nums1[l++];
        }
        else{
            res[ind++]=nums2[r++];
        }
       }
       while(l<m){
        res[ind++]=nums1[l++];
       }
       while(r<n){
        res[ind++]=nums2[r++];
       }
       for(int k=0;k<res.length;k++){
        nums1[k]=res[k];
       }

    }
}