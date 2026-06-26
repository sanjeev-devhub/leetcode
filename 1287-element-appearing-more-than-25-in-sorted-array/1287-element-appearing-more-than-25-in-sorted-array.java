class Solution {
    public int findSpecialInteger(int[] arr) {
        int per = arr.length / 4;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + per]) {
                return arr[i];
            }
        }
        return -1;
    }
}