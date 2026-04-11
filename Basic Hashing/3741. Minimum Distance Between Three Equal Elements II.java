class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,ArrayList<Integer> >map=new HashMap<>();
        for (int i =0;i<nums.length;i++){
            map.putIfAbsent(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        int min=Integer.MAX_VALUE;


        for(List<Integer> l1 : map.values()){
            if(l1.size()>=3){
                for(int i=0;i<l1.size()-2;i++){
                        int a=l1.get(i);
                        int b=l1.get(i+1);
                        int c=l1.get(i+2);
                        int cur=Math.abs(a-b)+Math.abs(b-c)+Math.abs(c-a);
                        min=Math.min(cur,min);
                }
            }
         
        }
        if(min==Integer.MAX_VALUE) return -1;
        return min;
    }
}