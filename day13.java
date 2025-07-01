class Solution {
    int firstOccurrence(int[] arr, int target) {
        // code here
        int low = 0, high = arr.length - 1;
        int result = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == target){
                result = mid;
                high = mid - 1;
                
            } else if (arr [mid] > target){
                high = mid - 1;
                
            } else {
                low = mid + 1;
            }
        }
        
        return result;
    }
    
    int lastOccurrence(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        int result = -1;
        
        while (low <= high){
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == target){
                result = mid;
                low = mid + 1;
                
                
            }else if (arr [mid] > target){
                high = mid - 1;
           
            } else {
                low = mid + 1;
            }
        }
        
        return result;
    }
    
    int countFreq (int[] arr, int target){
        int first = firstOccurrence(arr, target);
        
        if (first == -1) return 0;
        
        int last = lastOccurrence(arr, target);
        return last - first + 1;
    }
}
