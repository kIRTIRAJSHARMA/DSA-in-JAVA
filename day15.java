class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        
        if (s == null || s.length() == 0 || k == 0) return -1;
        
        int n = s.length();
        int left = 0, maxLen = -1;
        Map<Character, Integer> freqMap = new HashMap <>();
        
        
        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            
            while (freqMap.size() > k){
                char leftChar = s.charAt(left);
                freqMap.put(leftChar, freqMap.get(leftChar) - 1);
                
            if (freqMap.get(leftChar) == 0){
                freqMap.remove(leftChar);
            }
            left++;
        }
        
        if (freqMap.size() == k) {
            maxLen = Math.max(maxLen, right - left + 1);
        }
        }
        return maxLen;
    
    }
}