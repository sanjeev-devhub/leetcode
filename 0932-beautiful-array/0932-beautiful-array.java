class Solution {
    public int[] beautifulArray(int n) {
        List<Integer> list = helper(n);
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    private List<Integer> helper(int n) {
        if (n == 1) {
            return new ArrayList<>(Arrays.asList(1));
        }

        List<Integer> left = helper((n + 1) / 2);
        List<Integer> right = helper(n / 2);

        List<Integer> res = new ArrayList<>();

        // Generate odd numbers
        for (int x : left) {
            res.add(2 * x - 1);
        }

        // Generate even numbers
        for (int x : right) {
            res.add(2 * x);
        }

        return res;
    }
}