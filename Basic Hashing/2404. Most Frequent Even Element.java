class Solution {
    public int mostFrequentEven(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x : nums){

            if(x % 2 == 0){
                map.put(x, map.getOrDefault(x,0)+1);
            }
        }

        int maxFreq = 0;
        int ans = Integer.MAX_VALUE;

        for(int key : map.keySet()){

            int freq = map.get(key);

            if(freq > maxFreq){

                maxFreq = freq;
                ans = key;
            }

            else if(freq == maxFreq){

                ans = Math.min(ans,key);
            }
        }

        if(ans == Integer.MAX_VALUE){
            return -1;
        }

        return ans;
    }
}