class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for(int i : map.keySet()){
        ArrayList<Integer> temp=new ArrayList<>();
        temp.add(i);
        temp.add(map.get(i));
        res.add(temp);
        }
        return res;
    }
}