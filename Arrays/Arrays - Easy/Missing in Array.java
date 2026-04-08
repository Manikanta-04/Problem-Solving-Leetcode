class Solution {
    int missingNum(int arr[]) {
        // code here
        long sum=0;
        int n=arr.length+1;
        for (int i : arr){
            sum+=i;
        }
       long res=(long)n*(n+1)/2;
        return (int) (res-sum);
    }
}