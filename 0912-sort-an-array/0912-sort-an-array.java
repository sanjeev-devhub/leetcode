class Solution {
    public int[] sortArray(int[] arr) {
        mS(arr, 0, arr.length - 1);
        return arr;
    }

    private void mS(int[] arr, int low, int high) {
        if (low == high) {
            return;
        }
        int mid = (low + high) / 2;
        mS(arr, low, mid);
        mS(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[arr.length];
        int left = low;
        int right = mid + 1;
        int counter = 0;
        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp[counter++] = arr[left++];
            } else {
                temp[counter++] = arr[right++];
            }
        }
        while (left <= mid) {
            temp[counter++] = arr[left++];
        }
        while (right <= high) {
            temp[counter++] = arr[right++];
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }
    }
}