class Solution:

    def iterator(self, root, ceiling):

        if root is None:
            return 0


        ceiling = max(ceiling, root.val)
        result = self.iterator(root.left, ceiling) + self.iterator(root.right, ceiling)

        if ceiling == root.val: result +=1

        return result

    def goodNodes(self, root: TreeNode) -> int:


       return self.iterator(root,float('-inf'))

##countGoodNodesBinaryTree medium O(N)
