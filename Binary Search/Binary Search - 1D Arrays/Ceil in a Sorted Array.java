// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int n=arr.length;
        int l=0;
        int r=n-1;
        int res=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]>=x){
                res=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return res;
    }
}
