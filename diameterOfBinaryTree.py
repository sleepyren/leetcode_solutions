class Solution(object):
    def diameterOfBinaryTree(self, root):
        diameter = 0
        # diameter is the biggest root.left + root.right
        def height(root):
            if root == None:
                return 0

            heightLeft = height(root.left)
            heightRight = height(root.right)
            heightCurr = max(heightLeft, heightRight) + 1
            nonlocal diameter
            diameter = max(heightLeft + heightRight, diameter)
            return heightCurr
        height(root)
        return diameter
##diameterOfBinaryTree easy O(N)
