class Solution {
    public boolean checkIfExist(int[] arr) {
        int n=arr.length;
        HashSet<Integer> set1=new HashSet<>();
        for(int i : arr){
        if(set1.contains(i*2) || i%2==0 && set1.contains(i/2)) return true;
        set1.add(i);
      }
      return false;  
    }
}