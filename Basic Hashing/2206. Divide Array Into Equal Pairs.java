class Solution {
    public boolean divideArray(int[] nums) {
      int pairs=0;
      int[] freq=new int[501];
      for(int i : nums){
        freq[i]++;
      }
      for(int i=1;i<=500;i++){
        if(freq[i]%2!=0) return false;
      }
      return true;  
    }
}