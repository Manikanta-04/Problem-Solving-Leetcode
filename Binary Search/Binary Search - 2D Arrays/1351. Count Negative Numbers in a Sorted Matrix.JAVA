class Solution {
    public int countNegatives(int[][] grid) {
       int m=grid.length;
       int n=grid[0].length;
       int cnt=0;
    for(int i=0;i<m;i++){
         int l=0;
         int h=n-1;
         while(l<=h){
            int mid=(l+h)/2;
            if(grid[i][mid]>=0){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
         }
         if(l>n-1) cnt+=0;
         else cnt+=n-l;

    }
       return cnt;
    }
}