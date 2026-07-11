class Solution {
    public int[] arrayRankTransform(int[] arr) {
      int[] res=new int[arr.length];
      HashMap<Integer,Integer> map=new HashMap<>();
      int[] ca=arr.clone();
      Arrays.sort(ca);
    if(arr.length!=0)  map.put(ca[0],1);
      for(int i=1;i<arr.length;i++){
        if(!map.containsKey(ca[i])){
            map.put(ca[i],map.size()+1);
        }
      }
      for(int i=0;i<arr.length;i++){
        res[i]=map.get(arr[i]);
      }
      return res;

    }
}