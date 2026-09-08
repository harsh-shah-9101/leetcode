import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        // 1. Setup the HashMap mapping digits to their letters
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        // Start exploring using an empty string
        backtrack(result, digits, "", 0, map);
        
        return result;
    }
    
    private void backtrack(List<String> result, String digits, String current, int index, Map<Character, String> map) {
        // Base Case: If our string is the same length as the digits, we have a complete combination
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        
        // Get the current digit and look up its letters in the map
        char currentDigit = digits.charAt(index);
        String letters = map.get(currentDigit);
        
        // Loop through each letter and go down the next level of the tree
        for (int i = 0; i < letters.length(); i++) {
            // Adding a character to 'current' creates a new string just for the next recursive call.
            // The original 'current' remains unchanged for the next loop iteration.
            backtrack(result, digits, current + letters.charAt(i), index + 1, map);
        }
    }
}