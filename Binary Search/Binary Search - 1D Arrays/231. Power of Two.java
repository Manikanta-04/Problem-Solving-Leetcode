class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        int l=1,r=n;
        while(l<=r){
            int m=(l+r)/2;
            if(Math.pow(2,m)==n) return true;
            if(Math.pow(2,m)>n) r=m-1;
            else l=m+1;
        }
    return false;
    }
}