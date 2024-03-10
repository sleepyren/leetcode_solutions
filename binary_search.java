class Solution {
    public int search(int[] nums, int target) {
        
        //O(log N) time complexity solution 
        int start = 0; int end = nums.length -1;
        while (start <= end)
        {
            int mid = (start + end) / 2;
            if (nums[mid] > target) end = mid -1;
            if (nums[mid] < target) start = mid + 1;

            if (nums[mid] == target) return mid;


        }
        return -1;
    }
}
//binary_search easy O(logN)
