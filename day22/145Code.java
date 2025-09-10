import java.util.*;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    private void postorder(TreeNode root, List<Integer> result) {
        if (root == null) return;
        postorder(root.left, result);
        postorder(root.right, result);
        result.add(root.val);
    }
}