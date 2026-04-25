class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] res = new int[queries.length];

        for (int k = 0; k < queries.length; k++) {
            int sum = 0;
            int count = 0;

            for (int i = 0; i < nums.length; i++) {
                if (sum + nums[i] <= queries[k]) {
                    sum += nums[i];
                    count++;
                } else {
                    break;
                }
            }

            res[k] = count;
        }

        return res;
    }
}