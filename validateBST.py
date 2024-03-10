# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:

        inorder = []
        def recurse(root):
            if root is None:
                return

            recurse(root.left)
            inorder.append(root.val)
            recurse(root.right)

        recurse(root)
        print(inorder)

        for i in range(len(inorder) - 1):
            if inorder[i] >= inorder[i+1]:
                return False
        return True


##validateBST medium O(N)
