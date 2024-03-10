class Solution {
        List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        
        findAll(nums, new ArrayList<Integer>(), ans,0);
        ans.add(new ArrayList<Integer>());//adding null set;
        return ans;

    }
    //TC Confusing AF
    public List<List<Integer>> findAll(int[] nums, List<Integer> set, List<List<Integer>> ans, int index)
    {
        for (int i = index; i < nums.length; i++)
        {
            //copy the set add the element
            List<Integer> curr = new ArrayList<>();
            curr.addAll(set); 
            curr.add(nums[i]);
            //for (int z : curr) System.out.print(z);
            ans.add(curr);
            findAll(nums, curr, ans, i+1);
        } 
        return ans;
    }
}
//findAllSubsets medium O(2^N)
