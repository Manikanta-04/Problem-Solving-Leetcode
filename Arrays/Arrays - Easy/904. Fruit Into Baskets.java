class Solution {
    public int totalFruit(int[] fruits) {
      int n=fruits.length;
      int ml=0;  
    for(int i=0;i<n;i++){
        HashMap<Integer,Integer> map1=new HashMap<>();
        for(int j=i;j<n;j++){
            int k=fruits[j];
            map1.put(k,map1.getOrDefault(k,0)+1);
            if(map1.size()>2) break;
            ml=Math.max(ml,j-i+1);
        }
    }
    return ml;
    }
}