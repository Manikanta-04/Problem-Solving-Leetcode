class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        HashMap<Integer,Integer> map1=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int i=m-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
        if(st.isEmpty()){
             map1.put(nums2[i],-1);
        }
        else {
            map1.put(nums2[i],st.peek());
        }
             st.push(nums2[i]);

        }
        for(int i =0;i<n;i++){
            nums1[i]=map1.get(nums1[i]);
        }
        return nums1;
    }
}