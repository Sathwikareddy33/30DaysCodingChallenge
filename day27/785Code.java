class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] colors = new int[graph.length]; // 0 = unvisited, 1 = red, -1 = green
        for (int i = 0; i < graph.length; i++) {
            if (colors[i] == 0 && !dfs(graph, colors, i, 1))
                return false;
        }
        return true;
    }

    private boolean dfs(int[][] graph, int[] colors, int node, int color) {
        colors[node] = color;
        for (int neighbor : graph[node]) {
            if (colors[neighbor] == 0) {
                if (!dfs(graph, colors, neighbor, -color)) return false;
            } else if (colors[neighbor] == color) return false;
        }
        return true;
    }
}