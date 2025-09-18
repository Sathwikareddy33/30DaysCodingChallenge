
import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) return 0;
        int n = triangle.size();
        int[] dp = new int[n];
        // initialize with bottom row
        List<Integer> last = triangle.get(n - 1);
        for (int i = 0; i < n; i++) dp[i] = last.get(i);

        // fold up
        for (int layer = n - 2; layer >= 0; layer--) {
            List<Integer> row = triangle.get(layer);
            for (int i = 0; i <= layer; i++) {
                dp[i] = row.get(i) + Math.min(dp[i], dp[i + 1]);
            }
        }
        return dp[0];
    }
}