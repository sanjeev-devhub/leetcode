class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> ans = new ArrayList<>();

        findSubSequences(candidates, 0, target, new ArrayList<>(), ans);

        return ans;
    }

    private void findSubSequences(int[] arr, int index, int target, List<Integer> output, List<List<Integer>> answer) {
        if (index == arr.length) {
            if (target == 0) {
                answer.add(new ArrayList<>(output));
            }
            return;
        }
        if (arr[index] <= target) {
            output.add(arr[index]);
            findSubSequences(arr, index, target - arr[index], output, answer);
            output.remove(output.size() - 1);
        }
        findSubSequences(arr, index + 1, target, output, answer);
    }
}