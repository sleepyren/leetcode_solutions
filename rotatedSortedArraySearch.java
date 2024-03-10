class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 1 && nums[0]==target) return 0;
        int left = 0;
        int right = nums.length -1;

        while (left < right)
        {
            int mid = (left + right) /2;
            if (nums[mid] == target ) return mid;
            /*
            There is only one pivot and it must reside in either the first 
            half or the second half.
             */
             //if sorted and in portion
            if (nums[left] < nums[mid] && nums[left] <= target && nums[mid] >= target)
                right = mid;
                //if sorted and not in portion
            else if (nums[left] < nums[mid] && (nums[left] > target || nums[right] < target))
            left = mid + 1;
            
            //inconclusive, now look at second half
            else
            {
                //if sorted and in portion
                if (nums[mid+1] <= target && nums[right] >= target)
                left = mid + 1;
                //otherwise it was in the first portion
                else right = mid;
            }
        }
        //there is only one element left and if not ans its -1
        return (nums[left]==target)?left:-1;
    }
}
//rotatedSortedArraySearch medium O(logN)
