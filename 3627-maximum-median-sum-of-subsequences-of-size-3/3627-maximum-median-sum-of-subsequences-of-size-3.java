class Solution {
    public long maximumMedianSum(int[] nums) {
         Arrays.sort(nums);
        int n = nums.length;
        int k = n / 3;
        long total = 0;
        
        // Start at the second largest element
        int idx = n - 2; 
        for (int i = 0; i < k; i++) {
            total += nums[idx];
            idx -= 2;
        }
        return total;
    }
}