class Solution {
    int upperBound(int[] arr, int target) {
        // code here
         int n=arr.length;
        int l=0;
        int r=n-1;
        int res=n;
        while(l<=r){
            int m=(l+r)/2;
             if(arr[m]>target){
                res=m;
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return res;
    }
}
