class Solution:
    def generateParenthesis(self, n: int) -> List[str]:

        answer = []
        def recurse(openers, closers, curr):

            openedCount = openers - closers

            if openers == n and closers == n:
                answer.append(curr[:])
                return

            if openers < n:
                recurse(openers + 1, closers, curr + "(")

            if closers < openers:

                recurse(openers, closers + 1, curr + ")")



        recurse(0,0,"")
        return answer

##generateParenthesis medium O(2^N)

