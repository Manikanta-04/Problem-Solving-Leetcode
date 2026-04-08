class Solution {
    // Public method that matches your requirement
    public void reverseArray(int arr[]) {
        // Start recursion with the full range of the array
        reverseRecursive(arr, 0, arr.length - 1);
    }

    // Helper recursive method
    private void reverseRecursive(int[] arr, int start, int end) {
        // Base case: if start and end pointers meet or cross, stop
        if (start >= end) {
            return;
        }

        // Swap elements at start and end indices
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call with inner bounds
        reverseRecursive(arr, start + 1, end - 1);
    }
}
