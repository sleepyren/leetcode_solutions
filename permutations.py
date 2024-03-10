class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:

        if len(nums) == 1:
            return [nums]


        answer = []

        def recurse(nums, path):
            if len(nums) == 1:

                found = path.copy()
                found.append(nums[0])
                answer.append(found)
                return

            for i in range(len(nums)):
                curr = nums.pop(i)
                path.append(curr)
                recurse(nums, path)
                path.pop()
                nums.insert(i, curr)

            return answer
        return recurse(nums, [])

##permutations medium O(N!)
