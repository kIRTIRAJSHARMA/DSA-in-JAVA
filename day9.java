class Solution {
    boolean sameFreq(String s) {
        // code here
        
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int freq : freqMap.values()){
            countMap.put(freq, countMap.getOrDefault(freq, 0) + 1);
        }
        
        if (countMap.size() == 1) return true;
        
        if (countMap.size() > 2) return false;
        
        List<Integer> keys = new ArrayList<>(countMap.keySet());
        int f1 = keys.get (0), f2 = keys.get(1);
        int c1 = countMap.get(f1), c2 = countMap.get(f2);
        
        if (f1 > f2){
            int temp = f1; f1 = f2; f2 = temp;
            temp = c1; c1 = c2; c2 = temp;
        }
        
        if (f1 == 1 && c1 == 1)  return true;
        
        if ((f2 - f1 == 1) && c2 == 1) return true;
        
        return false;
        
    }
}