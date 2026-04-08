class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int maxi=Integer.MIN_VALUE;
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        for(int i =n-1;i>=0;i--){
           if(arr[i]>=maxi){
               res.add(arr[i]);
               maxi=arr[i];
           }
        }
        res.sort(Collections.reverseOrder());
        return res;
    }
}
