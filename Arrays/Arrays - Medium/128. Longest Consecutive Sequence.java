class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int cnt=0;
     if(n==0) return 0;
     HashSet<Integer> set1 =new HashSet<>();
     for(int i: nums){
        set1.add(i);
     }
     int lon=0;
     for(int num : set1){
        if(!set1.contains(num-1)){
            cnt=1;
            int x=num;
            while(set1.contains(x+1)){
                cnt+=1;
                x=x+1;
            }
        }
        lon=Math.max(lon,cnt); 
     }
     return lon;   
    }
}