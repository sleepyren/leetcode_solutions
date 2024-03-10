class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> char_set = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            if (char_set.get(nums[i])==null)
                char_set.put(nums[i],true);
            else
                return true;
            
        } 
        return false;
    }
}
//containsDuplicate easy O(N)
