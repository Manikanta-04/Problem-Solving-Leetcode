class Solution {
    public int[] findErrorNums(int[] nums) {
    int[] res=new int[2];
    int s=0,n=nums.length;
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i : nums){
        map.put(i,map.getOrDefault(i,0)+1);
    }
    for(int key : map.keySet()){
        if(map.get(key)>1){
            res[0]=key;
            break;
        }
    }
    for(int i : nums){
        s+=i;
    }   
    s-=res[0];
   int sumofn=(n*(n+1))/2;
    res[1]=sumofn-s;
    return res;
    }
}