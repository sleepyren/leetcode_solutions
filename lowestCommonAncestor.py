class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':

        curr = root
        while True:
            if p.val > curr.val and q.val > curr.val:
                curr  = curr.right
            elif p.val > curr.val and q.val <= curr.val:
                break
            elif p.val < curr.val and q.val < curr.val:
                curr = curr.left
            else:
                break
        return curr
##lowestCommonAncestorPY medium log(N)
