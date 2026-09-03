class Solution {
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();
        
        // We only need to check up to the point where the remaining 
        // characters are enough to contain the needle.
        for (int i = 0; i <= hLen - nLen; i++) {
            int j = 0;
            
            // Look ahead to check if the substring matches the needle
            while (j < nLen && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            
            // If we matched all characters in the needle, we found it!
            if (j == nLen) {
                return i; // Return the starting index
            }
        }
        
        return -1; // If no match is found
    }
}