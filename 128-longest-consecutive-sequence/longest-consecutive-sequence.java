import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        // Fix 1: Handle empty input
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int counter = 1;
        int max = 1;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i]) {
                continue; // Skip duplicates
            }

            if (nums[i + 1] - nums[i] == 1) {
                counter++;
            } else {
                max = Math.max(max, counter);
                counter = 1;
            }
        }

        // Fix 2: Return max comparison in case the longest streak ends at the last element
        return Math.max(max, counter);
    }
}