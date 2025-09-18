
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        final int INF = Integer.MAX_VALUE / 2;
        int[] dist = new int[n];
        for (int i = 0; i < n; i++) dist[i] = INF;
        dist[src] = 0;

        // Relax edges up to K+1 times (paths with up to K stops -> up to K+1 edges)
        for (int i = 0; i <= K; i++) {
            int[] tmp = dist.clone();
            for (int[] f : flights) {
                int u = f[0], v = f[1], w = f[2];
                if (dist[u] + w < tmp[v]) {
                    tmp[v] = dist[u] + w;
                }
            }
            dist = tmp;
        }

        return dist[dst] >= INF ? -1 : dist[dst];
    }
}