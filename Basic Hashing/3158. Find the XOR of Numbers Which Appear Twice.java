class Solution {
    public int duplicateNumbersXOR(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      int res=0;
      for(int i : nums){
        map.put(i,map.getOrDefault(i,0)+1);
      }
      for(int key: map.keySet()){
        if(map.get(key)==2){
            res^=key;
        }
      }
      return res==0?0:res;  
    }
}