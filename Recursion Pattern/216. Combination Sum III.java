class Solution {
void findcom(List<List<Integer>> res,List<Integer> temp,int i,int k,int n,int sum,int cnt){
        if(cnt==k){
            if(sum==n){
                res.add(new ArrayList<>(temp));
            }
            return;
        }
        if(i>9) return;
        temp.add(i);
        findcom(res,temp,i+1,k,n,sum+i,cnt+1);
        temp.remove(temp.size()-1);
        findcom(res,temp,i+1,k,n,sum,cnt);
        }
    public List<List<Integer>> combinationSum3(int k, int n) {
            List<List<Integer>> res=new ArrayList<>(); 
            findcom(res,new ArrayList<>(),1,k,n,0,0);
      return res;  
    }
}