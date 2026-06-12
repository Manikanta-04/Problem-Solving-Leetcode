class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        List<Integer> res = new ArrayList<>();
        List<Integer> kelem = new ArrayList<>();

        int r = 0;
        int n = nums.length;

        while(r < n){

            // add current element
            kelem.add(nums[r]);

            // if size exceeds k remove first element
            if(kelem.size() > k){
                kelem.remove(0);
            }

            // window formed
            if(kelem.size() == k){

                int max = Integer.MIN_VALUE;

                for(int x : kelem){
                    max = Math.max(max, x);
                }

                res.add(max);
            }

            r++;
        }

        int[] ans = new int[res.size()];

        for(int i = 0; i < res.size(); i++){
            ans[i] = res.get(i);
        }

        return ans;
    }
}