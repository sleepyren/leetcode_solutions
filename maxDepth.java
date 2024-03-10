class Solution {
    public int maxDepth(TreeNode root) {
        //TC = O(N) : O(1) operation for N elements
        //SC = O(log N) : the max space needed will be at 
        // the maxDepth which in a binary tree has log N elements 
        if (root == null) return 0;
        int max = Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);

        return max;

    }
}
//maxDepth easy O(N)
