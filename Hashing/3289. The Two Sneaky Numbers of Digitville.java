class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] res=new int[2];
        int[] freq=new int[100];
        for(int i : nums){
            freq[i]++;
        }
        int ind=0;
        for(int i =0;i<100;i++){
            if(freq[i]==2){
                 res[ind]=i;
                 ind++;
                 }
        }
        return res;
    }
}