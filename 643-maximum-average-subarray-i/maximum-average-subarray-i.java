class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int currentSum =0;

        int i;
        for(i =0;i<k;i++){
            currentSum +=nums[i];
        }
        int maxAvg= currentSum;

        for(i=k;i<nums.length;i++){

            currentSum +=nums[i]-nums[i-k];
            if(currentSum > maxAvg ){
                maxAvg = currentSum;
            }
        }
        return (double)maxAvg/k;
    }
}