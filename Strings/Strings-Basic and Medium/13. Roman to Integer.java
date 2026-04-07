class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map1=new HashMap<>();
        map1.put('I',1);
        map1.put('V',5);
        map1.put('X',10);
        map1.put('L',50);
        map1.put('C',100);
        map1.put('D',500);
        map1.put('M',1000);
        int total=0;
        for(int i=0;i<s.length()-1;i++){
            int curr=map1.get(s.charAt(i));
            int next=map1.get(s.charAt(i+1));
            if(curr<next) total-=curr;
            else total+=curr;
    }
                total+=map1.get(s.charAt(s.length()-1));
    return total;
    }
}