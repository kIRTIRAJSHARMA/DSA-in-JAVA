class Solution {
    public void reverseArray(int arr[]) {
        // First, get the total number of elements in the array
        int n = arr.length;
        
        // Loop only till the halfway point, no need to go full
        for (int i = 0; i < n / 2; i++) {
            // j is the index from the end that matches with i from the start
            int j = n - 1 - i;

            // Now swap arr[i] and arr[j] using a temporary variable
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
