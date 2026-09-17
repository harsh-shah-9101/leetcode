class Solution {
    public int[] plusOne(int[] digits) {
        // Start from the last digit and move backwards
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the digit is less than 9, just add 1 and we are done!
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            // If the digit is 9, adding 1 makes it 10, so we set it to 0
            // The loop will then continue to the next digit to add the "carry"
            digits[i] = 0;
        }
        
        // If we finish the loop, it means ALL digits were 9 (e.g., [9, 9, 9])
        // We need a new array with one extra space for the carry (to make [1, 0, 0, 0])
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        // (The rest of the new array is automatically initialized to 0 in Java)
        
        return newDigits;
    }
}