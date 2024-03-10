class Solution(object):
    def lengthOfLongestSubstring(self, s):

        left = 0
        hset = set()
        maximum = 0
        for i in range(len(s)):
            if not s[i] in hset:
                hset.add(s[i])
            else:
                while s[left] != s[i]:
                    hset.remove(s[left])
                    left += 1
                left += 1


            maximum = max(i - left + 1, maximum)
            i+=1
        return maximum

##lengthOfLongestSubstring medium O(N)
