class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            // 1. Skip special characters from the left (and prevent index out of bounds)
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // 2. Skip special characters from the right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            
            // 3. Compare lowercased versions of the characters
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            
            left++;
            right--;
        }
        return true;
    }
}
