import java.util.*;

class Solution {
    public int totalElements(int[] arr) {
        // code here
        
            int n = arr.length;
            int left = 0, maxLen = 0;
            
            Map<Integer, Integer> freqMap = new HashMap<>();
            
            for (int right = 0; right < n; right++) {
                freqMap.put(arr[right], freqMap.getOrDefault(arr[right], 0)+ 1);
                
                
                while (freqMap.size() > 2) {
                    
                    freqMap.put(arr[left],freqMap.get(arr[left]) - 1);
                    if (freqMap.get (arr[left]) == 0){
                        freqMap.remove(arr[left]);
                    }
                    
                    left++;
                }
                
                maxLen = Math.max(maxLen, right - left + 1);
            }
            
            return maxLen;
        
        
    }
}