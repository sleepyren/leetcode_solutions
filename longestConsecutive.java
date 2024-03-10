class Solution {
    public int longestConsecutive(int[] nums) {
        

        Set<Integer> set = new HashSet();
        for (int i = 0; i < nums.length; i++)
            set.add(nums[i]);

        int max = 0;
        for (int i = 0; i < nums.length; i++)
        {
            /*
            Imagine the number line. If the sequence has no number that comes before it or is the lowest possible number (-1 billion) then 
            that is definitely the start of the consecutive sequence.
            this is where we want to count from

            TC: so if I encounter a point in the sequence that is not the
            start im just gonna skip it, but if I encounter a start to the sequence then Im going to start looping, each element will be visited at most twice so this is O(N) time
            */
            boolean startCounting = nums[i] == -1_000_000_000 || !set.contains(nums[i] - 1);
            int current = 0;
            while (startCounting)
            {
                if (set.contains(nums[i] + current) == true)
                    current++;
                else
                    {
                    startCounting = false;} 
                if (max < current) max = current;
                if (nums[i] + current == 1_000_000_000) startCounting = false;
            } 

        }
        return max;
    }
}
//longestConsecutiveSequence medium O(N)
