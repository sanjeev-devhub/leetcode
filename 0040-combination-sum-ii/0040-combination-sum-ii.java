class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);

        findSubSequences(candidates, 0, target, new ArrayList<>(), ans);

        return ans;
    }

    private void findSubSequences(int[] arr, int index, int target, List<Integer> output, List<List<Integer>> answer) {
        if (target == 0) {
            answer.add(new ArrayList<>(output));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;
            output.add(arr[i]);
            findSubSequences(arr, i + 1, target - arr[i], output, answer);
            output.remove(output.size() - 1);
        }

    }
}