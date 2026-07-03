class Solution {
    public int distributeCandies(int[] candyType) {
      HashMap<Integer,Integer> map1=new HashMap<>();
      int n=candyType.length;
      int c=0;
      for(int i : candyType){
        map1.put(i,map1.getOrDefault(i,0)+1);
      }
      for(int key :map1.keySet()){
        if(c<=n/2) c++;
        else break;
      }
      if(c>n/2) return c-1;
      return c;  
    }
}