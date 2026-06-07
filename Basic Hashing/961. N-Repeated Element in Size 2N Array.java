class Solution {
    public int repeatedNTimes(int[] nums) {
   int l=nums.length;
   HashMap<Integer,Integer> map=new HashMap<>();
   for(int i : nums){
    map.put(i,map.getOrDefault(i,0)+1);
    if(map.get(i)==l/2) return i;
   }
   return 0;     
    }
}