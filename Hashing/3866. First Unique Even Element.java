class Solution {
        public int firstUniqueEven(int[] nums) {

                HashMap<Integer,Integer> map = new HashMap<>();

                        // store frequency of even numbers
                                for(int x : nums){

                                            if(x % 2 == 0){
                                                            map.put(x, map.getOrDefault(x,0)+1);
                                                                        }
                                                                                }

                                                            // find first unique even
                                    for(int x : nums){

                                                 if(x % 2 == 0 && map.get(x) == 1){
                                             return x;
                                                       }
                                                    }

                                                             return -1;
                                                     }
                              }