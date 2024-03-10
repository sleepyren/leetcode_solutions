class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = (nums.length-1);
        if (nums[left] < nums[right]) return nums[0];
        /*
        This is essentially a binary search problem that can
        be solved in O(log N) time. I set pointers to left
        and right of the array.
        First if is just a regular ordered array return arr[0]
        otherwise keep in mind that in the rotated array 
        if the min is at position k, then position k - 1 will be 
        greater which goes against the properties of a normal arr
        */
        while (left < right)
        {

            int mid = (left + right)/2;
            if (nums[mid] > nums[mid+1]) return nums[mid + 1];

            if (nums[left] < nums[mid]) left = mid + 1;

            else right = mid; 
        }
        return nums[left];
    }
}
//rotatedSortedArrayMin medium O(logN)
