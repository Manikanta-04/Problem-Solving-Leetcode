class Solution {
    void Findcom(int ind,int[] arr,int target,List<List<Integer>> res,List<Integer> temp){
        int n=arr.length;
        if(ind==n){
            if(target==0){
                res.add(new ArrayList<>(temp));
            }
            return;
        }
        if(arr[ind]<=target){
            temp.add(arr[ind]);
            Findcom(ind,arr,target-arr[ind],res,temp);
            temp.remove(temp.size()-1);
        }
        Findcom(ind+1,arr,target,res,temp);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> res=new ArrayList<>();
       Findcom(0,candidates,target,res,new ArrayList<>());
       return res; 
    }
}