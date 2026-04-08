class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        HashSet<Integer> set1=new HashSet<>();
        for(int i : a ){
            set1.add(i);
        }
        for(int i : b){
            set1.add(i);
        }
        
     ArrayList<Integer> res=new ArrayList<>(set1);
     Collections.sort(res);
     return res;
     
    }
}
