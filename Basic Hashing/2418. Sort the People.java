class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        int n = names.length;
        String[] res = new String[n];

        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);
        }

        int idx = 0;

        while (!map.isEmpty()) {

            int maxHeight = Integer.MIN_VALUE;

            for (int h : map.keySet()) {
                maxHeight = Math.max(maxHeight, h);
            }

            res[idx++] = map.get(maxHeight);
            map.remove(maxHeight);
        }

        return res;
    }
}