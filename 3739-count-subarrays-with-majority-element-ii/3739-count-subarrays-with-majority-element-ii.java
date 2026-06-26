class Solution {

    class FenwickTree {
        int[] tree;

        FenwickTree(int size) {
            tree = new int[size + 2];
        }

        void update(int index, int value) {
            while (index < tree.length) {
                tree[index] += value;
                index += index & -index;
            }
        }

        int query(int index) {
            int count = 0;
            while (index > 0) {
                count += tree[index];
                index -= index & -index;
            }
            return count;
        }
    }

    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;

        int offset = n + 1;
        FenwickTree fenwickTree = new FenwickTree(2 * n + 5);

        long subarrayCount = 0;
        int prefixBalance = 0;

        // Empty prefix
        fenwickTree.update(offset, 1);

        for (int num : nums) {
            if (num == target) {
                prefixBalance++;
            } else {
                prefixBalance--;
            }

            subarrayCount += fenwickTree.query(prefixBalance + offset - 1);

            fenwickTree.update(prefixBalance + offset, 1);
        }

        return subarrayCount;
    }
}