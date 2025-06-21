class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        int n = arr.length;

        // Step 1: Place each positive number (1 to n) at its correct index
        // i.e., number 1 should be at index 0, number 2 at index 1, and so on.
        for (int i = 0; i < n; i++) {
            // Only consider numbers in the range 1 to n (ignore negatives and larger numbers)
            // Also, avoid infinite swapping by ensuring the current number isn't already in its correct place
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                // Swap arr[i] with arr[arr[i] - 1] to put it in the right position
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }

        // Step 2: After rearrangement, the first place where index + 1 != value is the missing number
        // For example, if arr[2] != 3, then 3 is missing
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        // Step 3: If all numbers from 1 to n are present, the missing number is n + 1
        return n + 1;
    }
}
