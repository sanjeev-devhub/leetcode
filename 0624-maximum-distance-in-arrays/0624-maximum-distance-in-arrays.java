class Solution {
    public int maxDistance(List<List<Integer>> arrays) {

        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);

        int ans = 0;

        for (int i = 1; i < arrays.size(); i++) {

            List<Integer> curr = arrays.get(i);

            int first = curr.get(0);
            int last = curr.get(curr.size() - 1);

            ans = Math.max(ans, Math.max(last - min, max - first ));

            min = Math.min(min, first);
            max = Math.max(max, last);
        }

        return ans;
    }
}