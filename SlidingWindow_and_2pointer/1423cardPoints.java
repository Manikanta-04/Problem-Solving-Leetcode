class Solution {
    public int maxScore(int[] cardPoints, int k) {
     int maxsum=0,ls=0,rs=0;
     int n=cardPoints.length;
     for(int i=0;i<k;i++){
        ls+=cardPoints[i];
     }
     maxsum=ls;
     for(int i=k-1;i>=0;i--){
        ls-=cardPoints[i];
        rs+=cardPoints[n-1];
        maxsum=Math.max(maxsum,ls+rs);
        n--;
     }
     return maxsum;   
    }
}