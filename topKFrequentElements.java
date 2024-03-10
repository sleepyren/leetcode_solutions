class Solution {
    public int listToAns(List<Integer> list, int[] ans, int position)
    {
        for (int element : list )
        {
            ans[position] = element;
            position++;
            //if (position >= ans.length) return position;
        }
        return position;
    }
    public int[] topKFrequent(int[] nums, int k) {
        int[] ansArr = new int[k];
        HashMap<Integer, Integer> frequencyMap = new HashMap();
        for (int i = 0; i < nums.length; i++)
        {
            int freq = frequencyMap.getOrDefault(nums[i],0) + 1;
            frequencyMap.put(nums[i], freq);
        }

        //bucket sort <---
        List<List<Integer>> buckets = new ArrayList<List<Integer>>(nums.length + 1);
        for (int i = 0; i < nums.length + 1; i++)
            buckets.add(new ArrayList<Integer>());


        for (int element : frequencyMap.keySet())
        {
            int freq = frequencyMap.get(element);

            List<Integer> bucket = buckets.get(freq);
            //THIS IS THE CAPACITY <- the size is still 0
            //therefore IndexOutOfBoundsException

            if (bucket == null)
            {
            List<Integer> newbucket = new ArrayList<>();
            newbucket.add(element);
            buckets.set(freq, newbucket);
            }
            else
                bucket.add(element);
        }

        int counter = nums.length;
        int anscount = 0;
        while (counter >= 1 && anscount < k)
        {

            List<Integer> bucket = buckets.get(counter);
            if (bucket!=null)
                anscount = listToAns(bucket, ansArr, anscount);
            counter--;
        }

    return ansArr;
    }
}
topKFrequentElements medium O(N)
