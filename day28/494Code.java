public class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = Arrays.stream(nums).sum();
        if (sum < Math.abs(target) || (sum - target) % 2 != 0) return 0;

        int subsetSum = (sum - target) / 2;
        int[] dp = new int[subsetSum + 1];
        dp[0] = 1;

        for (int num : nums) {
            for (int i = subsetSum; i >= num; i--) {
                dp[i] += dp[i - num];
            }
        }
        return dp[subsetSum];
    }
}