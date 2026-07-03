class Solution {

    public boolean checkPrimeFrequency(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x : nums){
            map.put(x, map.getOrDefault(x,0)+1);
        }

        for(int freq : map.values()){

            if(isPrime(freq)){
                return true;
            }
        }

        return false;
    }
    public boolean isPrime(int n){

        if(n < 2){
            return false;
        }

        for(int i=2; i*i<=n; i++){

            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}