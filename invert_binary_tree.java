class Solution {
    public TreeNode invertTree(TreeNode root) {
        //TC : O(N) each node must be traverse
        //SC : O(log N) saves one node at each level

        if (root == null) return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
//invert_binary_tree easy O(N)

