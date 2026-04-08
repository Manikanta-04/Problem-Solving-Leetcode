class Solution {
    public int removeDuplicates(int[] nums) {
       HashSet<Integer> seen =new HashSet<>();
       for(int i : nums){
        seen.add(i);
       }
       int i=0;
       for(int j : seen){
        nums[i]=j;
        i++;
       }
       return seen.size();
    }
}