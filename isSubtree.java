
class Solution {
    //I have defined the helper function sameTree
    public boolean isSubtree(TreeNode root, TreeNode subroot) {
        if (root == null && subroot != null) return false;
    //if both are not null (so root is defined and sub is not)
    //it must be a subtree because null is a subtree of EVERY tree
    //running time is O(Tree * Subtree) because for every node
    //we are runninf sameTree which could have O(subTree) calls
        if (subroot==null) return true; 
        if (sameTree(root, subroot)) return true;
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);

    }
    public boolean sameTree(TreeNode root, TreeNode subroot)
    {
        if (root==null && subroot == null) return true;
        if (root == null || subroot == null) return false;

        if (root.val == subroot.val)
            return sameTree(root.left, subroot.left) && sameTree(root.right, subroot.right);

        return false;
    }
}
//isSubtree easy O(S*T)
