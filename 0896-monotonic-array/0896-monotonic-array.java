class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isIncreasing = false;
        boolean isDecreasing = false;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i - 1] < nums[i]) {
                isIncreasing = true;
            } else if (nums[i - 1] > nums[i]) {
                isDecreasing = true;
            }

            if (isIncreasing && isDecreasing) {
                return false;
            }
        }

        return true;
    }
}