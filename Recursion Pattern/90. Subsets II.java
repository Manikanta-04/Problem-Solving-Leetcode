class Solution {
    void findsub(int[] arr,int i,HashSet<List<Integer>> res,List<Integer> temp){
        if(i==arr.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[i]);
        findsub(arr,i+1,res,temp);
        temp.remove(temp.size()-1);
        findsub(arr,i+1,res,temp);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
     HashSet<List<Integer>> res=new HashSet<>();
     findsub(nums,0,res,new ArrayList<>());
     List<List<Integer>> l1=new ArrayList<>(res);
     return l1;   
    }
}