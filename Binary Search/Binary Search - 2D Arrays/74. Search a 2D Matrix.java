class Solution {
    int bs(int mat[],int N,int x){
        int l=0,r=N-1;
        while(l<=r){
            int m=(l+r)/2;
            if(mat[m]==x) return x;
            else if(mat[m]>x) r=m-1;
            else l=m+1;
        }
        return -1;
    } 
    public boolean searchMatrix(int[][] matrix, int target) {
      int  m=matrix.length;
      int n=matrix[0].length;
      for(int i=0;i<m;i++){
       if(bs(matrix[i],n,target)==target) return true;
        }
      return false; 
    }
}