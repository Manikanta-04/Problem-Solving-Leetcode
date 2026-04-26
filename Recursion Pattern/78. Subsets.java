public class Solution {
    public void rec(int[] nums,int ind,List<List<Integer>> res,List<Integer> temp){
        if(ind==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[ind]);
        rec(nums,ind+1,res,temp);
        temp.remove(temp.size()-1);
        rec(nums,ind+1,res,temp);

    }
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
       List<List<Integer>> r=new ArrayList<>();
       rec(nums,0,r,new ArrayList<>());
       return r;
    }
}
