class Solution {
    public int splitArray(int[] arr, int k) {
        // code here
        int low = 0, high = 0;
        for (int num : arr){
            
            low = Math.max(low, num);
            high += num;
        }
        
        int result = high;
        
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (isValid(arr, k, mid)){
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return result;
        
    }
    
    private boolean isValid (int[] arr, int k, int maxSumAllowed) {
        int count = 1, currentSum = 0;
        for (int num : arr){
            if (currentSum + num > maxSumAllowed) {
                count++;
                currentSum = num;
                if (count > k) return false;
            } else {
                currentSum += num;
            }
        }
        return true;
    }
}