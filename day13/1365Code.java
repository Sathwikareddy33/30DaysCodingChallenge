class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101]; // Since 0 <= nums[i] <= 100
        for (int num : nums) {
            count[num]++;
        }
        
        // Prefix sum to count numbers smaller than i
        for (int i = 1; i < 101; i++) {
            count[i] += count[i - 1];
        }
        
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] == 0 ? 0 : count[nums[i] - 1];
        }
        return result;
    }
}