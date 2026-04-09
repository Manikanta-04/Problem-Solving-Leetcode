class Solution {
    int fun1(int[] weights,int cap){
        int d=1,load=0;
        for(int i : weights){
            if(load+i>cap){
                d++;
                load=i;
            }
            else load+=i;

        }
        return d;
    }
    public int shipWithinDays(int[] weights, int days) {
      int maxi=weights[0];
      int sum=0;
      for(int i : weights){
            maxi=Math.max(maxi,i);
            sum+=i;
      }
      int l=maxi,r=sum;
      while(l<=r){
        int m=(l+r)/2;
        if(fun1(weights,m)<=days) r=m-1;
        else l=m+1;
      }  
      return l;
    }
}