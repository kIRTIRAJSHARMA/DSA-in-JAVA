// User function Template for Java

class Solution {
    // Helper function to reverse a portion of the array between given start and end indices
    static void reverse(int arr[], int start, int end) {
        // Swap elements from start and end moving toward the center
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate an array to the left (counter-clockwise) by d elements
    static void rotateArr(int arr[], int d){
        int n = arr.length;

        // Handle cases where d >= n
        d = d % n;

        // If no rotation needed
        if (d == 0) return;

        // Step 1: Reverse the first d elements
        reverse(arr, 0, d - 1);

        // Step 2: Reverse the remaining n - d elements
        reverse(arr, d, n - 1);

        // Step 3: Reverse the entire array
        reverse(arr, 0, n - 1);
    }
}
