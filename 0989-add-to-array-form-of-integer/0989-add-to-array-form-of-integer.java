class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();
        int carry = 0;

        for (int i = nums.length - 1; i >= 0; i--) {

            int sum = nums[i] + (k % 10) + carry;

            ans.add(sum % 10);

            carry = sum / 10;
            k /= 10;
        }

        while (k > 0 || carry > 0) {

            int sum = (k % 10) + carry;

            ans.add(sum % 10);

            carry = sum / 10;
            k /= 10;
        }
        Collections.reverse(ans);
        return ans;
        
    }
}