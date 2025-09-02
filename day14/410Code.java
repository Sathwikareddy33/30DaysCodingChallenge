class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0, right = 0;
        for (int num : nums) {
            left = Math.max(left, num);
            right += num;
        }
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            int sum = 0, pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    sum = 0;
                    pieces++;
                }
                sum += num;
            }
            if (pieces > k) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}