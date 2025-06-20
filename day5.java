class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        
        int n = nums.length;
        
        List<Integer> result = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for (int i = 0; i < n;){
            int count =1;
            int current = nums[i];
            
            while(i + count < n && nums[i+count]== current){
                count++;
            }
            if (count > n/3) {
                result.add(current);
            }
            i+=count;
        }
        return result;
    }
}
