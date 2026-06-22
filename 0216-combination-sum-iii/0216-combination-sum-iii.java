class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
       int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<List<Integer>> ans = new ArrayList<>();
        findSubSequences(arr, 0, n, new ArrayList<>(), ans, k);

        return ans;
    }

    private void findSubSequences(int[] arr, int index, int target, List<Integer> output, List<List<Integer>> answer, int windowSize) {
        if (target == 0) {
            if(windowSize==output.size())
            answer.add(new ArrayList<>(output));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;
            output.add(arr[i]);
            findSubSequences(arr, i + 1, target - arr[i], output, answer, windowSize);
            output.remove(output.size() - 1);
        }

    }
}