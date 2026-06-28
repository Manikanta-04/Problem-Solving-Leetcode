class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] res=new int[friends.length];
        int[] freq=new int[101];
        for(int i : friends) {
            freq[i]++;
        }
        int ind=0;
        for(int i : order){
            if(freq[i]!=0) res[ind++]=i;
        }
        return res;
    }
}