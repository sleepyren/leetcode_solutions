class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        #combines the lists, sorts by first element and reverses it
        # this is not a list so i cannot access the elements
        # so i did not use .sort() or the regular index access
        combined = sorted(zip(position, speed), reverse = True)
        slowCar = 0
        ans = 0
        for p, s in combined:
            timeLeft = (target - p) / s
            if timeLeft > slowCar:
                ans+=1
                slowCar = timeLeft
        return ans
##carFleet medium O(NlogN)



