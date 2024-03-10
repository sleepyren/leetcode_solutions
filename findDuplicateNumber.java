class Solution {
    public int findDuplicate(int[] nums) {
        //this problem is super counter-intuitive
        //for help understanding see here:
        //https://stackoverflow.com/questions/2936213/how-does-finding-a-cycle-start-node-in-a-cycle-linked-list-work
        int slow = nums[0]; int fast = nums[nums[0]];
        while (slow != fast)
        {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        //return slow to beginning 
        //make fast pointer a slow pointer too
        slow = 0;
        while (slow != fast)
        {
            slow = nums[slow];
            fast = nums[fast];
        }


        //return the actual number from the array since slow = array element
        return slow;
    }
}
//findDuplicateNumber medium O(N)
