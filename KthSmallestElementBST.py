# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:

        inorder = []
        def recurse(root):
            if root is None:
                return

            recurse(root.left)
            inorder.append(root.val)
            recurse(root.right)

        recurse(root)

        return inorder[k - 1]

##KthSmallestElementBST medium O(N)

