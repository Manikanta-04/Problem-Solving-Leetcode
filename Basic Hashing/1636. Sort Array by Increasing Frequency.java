HashMap<Integer,Integer> map = new HashMap<>();

        // store frequencies
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[nums.length];
        int idx = 0;

        while(!map.isEmpty()){

            int chosenNum = 0;
            int minFreq = Integer.MAX_VALUE;

            // find element with minimum frequency
            // if same frequency, choose larger element
            for(int key : map.keySet()){

                int freq = map.get(key);

                if(freq < minFreq){

                    minFreq = freq;
                    chosenNum = key;
                }
                else if(freq == minFreq){

                    if(key > chosenNum){
                        chosenNum = key;
                    }
                }
            }

            // add chosen number freq times
            for(int i = 0; i < minFreq; i++){

                ans[idx++] = chosenNum;
            }

            // remove from map
            map.remove(chosenNum);
        }

        return ans;