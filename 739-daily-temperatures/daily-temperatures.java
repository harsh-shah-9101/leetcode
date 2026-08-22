class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];

        // Process from right to left
        for (int i = n - 2; i >= 0; i--) {
            int j = i + 1;

            // Jump forward using already computed results
            while (j < n && temperatures[j] <= temperatures[i]) {
                if (result[j] == 0) {
                    j = n; // No future warmer day exists
                    break;
                }
                j += result[j]; // Jump directly to the next warmer day
            }

            if (j < n) {
                result[i] = j - i;
            }
        }

        return result;
    }
}