class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
       int s=0,l=0,r=0,n=arr.length,a=0,c=0;
       while(r<n){
        s+=arr[r];
            if(r-l+1==k){
                a=s/k;
                if(a>=threshold) c++;
                s-=arr[l];
                l++;
            }
        r++;    
       }
       return c; 
    }
}