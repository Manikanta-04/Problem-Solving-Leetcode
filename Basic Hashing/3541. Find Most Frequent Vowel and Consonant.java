class Solution {
    public int maxFreqSum(String s) {
       HashMap<Character,Integer> vowel = new HashMap<>();
        HashMap<Character,Integer> cons = new HashMap<>();

        for(char ch : s.toCharArray()){

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){

                vowel.put(ch, vowel.getOrDefault(ch,0)+1);
            }
            else{

                cons.put(ch, cons.getOrDefault(ch,0)+1);
            }
        }

        int maxVowel = 0;
        int maxCons = 0;

        for(int freq : vowel.values()){

            maxVowel = Math.max(maxVowel, freq);
        }

        for(int freq : cons.values()){

            maxCons = Math.max(maxCons, freq);
        }

        return maxVowel + maxCons;
 
    }
}