class Solution {
    public boolean validTree(int n, int[][] edges) {
        int[] parent = new int[n];
        Arrays.fill(parent, -1);

        for (int[] edge : edges) {
            int x = find(parent, edge[0]);
            int y = find(parent, edge[1]);
            if (x == y) return false;
            parent[x] = y;
        }
        return edges.length == n - 1;
    }

    private int find(int[] parent, int i) {
        while (parent[i] != -1) i = parent[i];
        return i;
    }
}