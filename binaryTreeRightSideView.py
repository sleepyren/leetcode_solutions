class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        if root == None: return []
        """
        Okay so the person standing on the right side would see the right node in
        the right subtree, otherwise they would see the rightmost node in the left subtree.

        I think a good idea would be to do a Breadth First Search
        and simply storing the last node being iterated in the level into the answer
        """
        ansList = []
        Q = collections.deque()
        Q.append(root)


        while Q:

            length = len(Q)
            for i in range(length):

                curr = Q.pop()
                if i == length -1:
                    ansList.append(curr.val)



                if not curr.left == None: Q.appendleft(curr.left)
                if not curr.right == None: Q.appendleft(curr.right)

        return ansList
##BinaryTreeRightSideView medium O(N)
