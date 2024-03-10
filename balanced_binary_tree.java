class Solution {
    public int getHeight(TreeNode root)
    {
        //O(N) solution
        if (root == null) return 0;
        

        int left = getHeight(root.left);
        int right = getHeight(root.right);
        
        if (left == -1 || right == -1) return -1;
        if (Math.abs(left - right) > 1) return -1;

        return Math.max(left, right) + 1;


    }
    public boolean isBalanced(TreeNode root) {
        
        if (getHeight(root) > -1) return true;
        return false;
    }
}
//balanced_binary_tree easy O(N)
