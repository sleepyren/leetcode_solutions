class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:

        candidates.sort()
        answer = []

        # In each call we are choosing i
        def recurse(i, target, path):

            if target == 0:
                answer.append(path.copy())
                return

            if i > len(candidates) -1:
                return

            if target < 0:
                return

            #Choose i
            path.append(candidates[i])
            recurse(i+1, target - candidates[i], path)
            path.pop()



            #Do not choose i or any duplicates
            while i + 1 < len(candidates) and candidates[i] == candidates[i+1]:
                i+= 1

            recurse(i + 1, target, path)


        recurse(0, target, [])
        return answer
##combinationSum2 medium O(2^N)
