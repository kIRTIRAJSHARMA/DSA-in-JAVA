class Solution {

    // Method to push all zeros in the array to the end while maintaining the order of non-zero elements
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;    // Get the length of the array
        int index = 0;         // This index will track the position to place the next non-zero element

        // Traverse through the array
        for (int i = 0; i < n; i++) {
            // If the current element is not zero, place it at the current index position
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;       // Move the index forward after placing a non-zero element
            }
        }

        // After all non-zero elements are placed, fill the remaining positions with zero
        while (index < n) {
            arr[index] = 0;
            index++;           // Move to the next index
        }
    }
}
