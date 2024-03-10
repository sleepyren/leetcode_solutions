class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if root == None: return None
        Q = collections.deque()
        Q.append(root)
        ans = []

        while len(Q) > 0:
            level = []
            for i in range(len(Q)):
                curr = Q.popleft()

                level.append(curr.val)
                if not curr.left is None: Q.append(curr.left)
                if not curr.right is None: Q.append(curr.right)
            ans.append(level)

        return ans

##binaryTreeLevelTraversal medium O(N)
