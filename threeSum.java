class Solution {
    public List<List<Integer>> twoSum(int[] nums, int target, int index, List<List<Integer>> solutions)
    {
        int left = index + 1; int right = nums.length - 1;
        while (left < right)
        {
            if (nums[left] + nums[right] > target) right--;
            else if (nums[left] + nums[right] < target) left++;
            else
                {
                    List<Integer> ans = new ArrayList<Integer>(3);
                    ans.add(nums[index]);
                    ans.add(nums[left]);
                    ans.add(nums[right]);
                    solutions.add(ans);
                    //we never want to consider duplicate numbers in our solution
                //GET THEM OUT
               while (right < nums.length-1 && left< right && nums[right - 1] == nums[right]) right--;
                while (left < right && nums[left + 1] == nums[left]) left++;
                    left++;
                    right--;
                }
                
        }
        return solutions;

    }
    public List<List<Integer>> threeSum(int[] nums) {
        /*
        To solve this sort the array thats O(N log N)

        Then recall the TwoSum II algorithm to find a two sum (x + y) = target
        in O(N) time
        Since the array is sorted I can run through each input N 
        and perform the algorithm O(N^2) time
        i can see the total TC is O(N^2 + N Log N)
        */

        Arrays.sort(nums);
        List<List<Integer>> solutions = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++)
        {
            if (i > 0 && nums[i-1] == nums[i]) continue;
            solutions = twoSum(nums, nums[i] * -1, i, solutions);
        }
        return solutions;
    }
}
//3Sum medium O(N^2)
