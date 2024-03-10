class Solution:

    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:

        answer = []

        def recursiveSum(candidates, target, path):

            if target == 0:
                answer.append(path.copy())
                return

            if target < 0: return


            # for element in candidates:

            for i in range(len(candidates)):
                element = candidates[i]
                path.append(element)
                print(path)
                recursiveSum(candidates[i:len(candidates)], target - element, path)
                path.pop()

            return answer
        return recursiveSum(candidates, target, [])
# The 'M' factor comes from the depth of recursion. Each recursive call decreases the target value by at least the smallest element in the candidates list.
##combinationSum medium O(N^m)
