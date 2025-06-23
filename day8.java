// User function Template for Java

class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;
        
        StringBuilder sb = new StringBuilder();
        
        while (i >= 0 || j >= 0 || carry > 0) {
            
            int bit1 = i >= 0 ? s1.charAt (i) - '0' : 0;
            int bit2 = j >= 0 ? s2.charAt (j) - '0' : 0;
        
            int sum = bit1 + bit2 + carry;
            sb.append(sum % 2);
            carry = sum / 2;
            
            i--;
            j--;
            
        }
        
        String result = sb.reverse(). toString();
        int index = 0;
        while (index < result. length() && result.charAt (index) == '0'){
            
            index++;
        }
        
        return index == result.length() ? "0" : result.substring(index);
        
    }
}