class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int n=nums.size();
        int pairs=0;
     int l=0;
     int r=n-1;
     while(l<=r){
        if(nums.get(l)+nums.get(r)<target) {
            pairs+=(r-l);
            l++;
            }
            else r--;
        }
        return pairs;
    }
}