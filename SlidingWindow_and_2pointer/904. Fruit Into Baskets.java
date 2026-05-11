class Solution {
    public int totalFruit(int[] fruits) {
      int n=fruits.length;
      int ml=0,l=0,r=0; 
      HashMap<Integer,Integer> map1=new HashMap(); 
      while(r<n){
        map1.put(fruits[r],map1.getOrDefault(fruits[r],0)+1);
        while(map1.size()>2){
            map1.put(fruits[l],map1.get(fruits[l])-1);
            if(map1.get(fruits[l])==0) map1.remove(fruits[l]);
            l++;
        }
        ml=Math.max(ml,r-l+1);
        r++;
      }
    return ml;
    }
}