class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                    if(j==m-1) ans[i]=-1;
                    else{
                        int c=0;
                        for(int k=j+1;k<m;k++){
                            if(nums1[i]<nums2[k]) {
                                ans[i]=nums2[k];
                                c++;
                                break;}
                        }   
                        if(c==0) ans[i]=-1;

                    }
                }
            }
        }
        return ans;
    }
}