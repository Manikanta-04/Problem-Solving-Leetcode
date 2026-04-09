class Solution {
    public int nthRoot(int n, int m) {
        // code here
        if(n==0 || m==0) return 0;
     int l=1,r=m;
     while(l<=r){
         int mid=(l+r)/2;
         if(Math.pow(mid,n)==m) return mid;
         else if(Math.pow(mid,n)>=m) r=mid-1;
         else l=mid+1;
     }
     return -1;
      
    }
}