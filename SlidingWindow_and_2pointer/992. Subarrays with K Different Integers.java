class Solution {
    public int subarraylessthank(int[]nums,int k){
        int n=nums.length,cnt=0,l=0,r=0;
     HashMap<Integer,Integer> map=new HashMap<>();
     while(r<n){
        map.put(nums[r],map.getOrDefault(nums[r],0)+1);
        while(map.size()>=k){
            map.put(nums[l],map.get(nums[l])-1);
            if(map.get(nums[l])==0) map.remove(nums[l]);
            l++;
        }
        if(map.size()<k) cnt+=(r-l+1);
        r++;
     }
     return cnt;       
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
     int n=nums.length,cnt=0,l=0,r=0;
     HashMap<Integer,Integer> map=new HashMap<>();
     while(r<n){
        map.put(nums[r],map.getOrDefault(nums[r],0)+1);
        while(map.size()>k){
            map.put(nums[l],map.get(nums[l])-1);
            if(map.get(nums[l])==0) map.remove(nums[l]);
            l++;
        }
        if(map.size()<=k) cnt+=(r-l+1);
        r++;
     }
     int total=cnt-subarraylessthank(nums,k);   
     return total;  
    }
}