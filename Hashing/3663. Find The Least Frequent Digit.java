class Solution {
    public int getLeastFrequentDigit(int n) {

        HashMap<Integer,Integer> map = new HashMap<>();

        // count frequencies
        while(n > 0){

            int digit = n % 10;

            map.put(digit, map.getOrDefault(digit,0)+1);

            n /= 10;
        }

        int minFreq = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;

        // find least frequent digit
        for(int key : map.keySet()){

            int freq = map.get(key);

            // smaller frequency found
            if(freq < minFreq){

                minFreq = freq;
                ans = key;
            }

            // same frequency -> smaller digit
            else if(freq == minFreq){

                ans = Math.min(ans,key);
            }
        }

        return ans;
    }
}