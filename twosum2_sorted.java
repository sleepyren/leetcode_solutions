class Solution {
    public int[] twoSum(int[] numbers, int target) {
    
    //this algorithm works by ruling out options in each round
    //this makes smaller the pool of potential answers
    //it is only O(N) because at most there will be n-1 iterations
    int[] ans = new int[2];
    int left = 0; int right = numbers.length - 1;
    while (left < right)
    {
        int sum = numbers[left] + numbers[right];
        if (sum > target)
            right--;
        else if (sum < target)
            left++;
        else
            {
                //because it is one indexed not 0
                ans[0] = left + 1; ans[1] = right + 1; 
                return ans;
            }
    }
    return ans;
    }
}
//twoSum2_sorted medium O(N)
