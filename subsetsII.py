class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:

        answer = []
        nums.sort()

        def recurse(i, subset):

            if i > len(nums) - 1:
                answer.append(subset.copy())
                return

            #subsets that include nums[i]
            subset.append(nums[i])
            recurse(i+1, subset)
            subset.pop()


            #subsets that DO NOT include nums[i]
            while i + 1 < len(nums) and nums[i] == nums[i+1]:
                i += 1
            recurse(i+1, subset)

        recurse(0, [])
        return answer

##subsetsII medium O(2^N)
