class Solution {
    public int[] replaceElements(int[] arr) {
        int[] res=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length-1;i++){
            int maxi=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>maxi) maxi=arr[j];
            }
           res[k++]=maxi;
        }
        res[arr.length-1]=-1;
        return res;
    }
}