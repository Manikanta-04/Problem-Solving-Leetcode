class Solution {
    public boolean checkIfExist(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
      for(int i =0;i<n-1;i++){
        for(int j=0;j<n;j++){
            if((arr[i]*2)==arr[j] && i!=j) return true;
        }
      }
      return false;  
    }
}