class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        #smallest possible value is one
        # the greatest possible value is the max of the piles list

        highest = max(piles)

        left = 1
        right = highest
        answer = right

        while left < right:
            mid = (left + right) // 2
            counter = 0
            for element in piles:
                counter += ceil(element/mid)

            if counter > h:
                left = mid + 1
            else:
                answer = min(mid, answer)
                right = mid
        return answer
##minEatingSpeed(Koko) medium O(NlogN)
