class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            int curr=arr[i];
            while(!st.isEmpty() && st.peek()>=curr){
                st.pop();
            }
            res.add(st.isEmpty()?-1:st.peek());
            st.push(curr);
        }
        Collections.reverse(res);
       return res; 
    }
}