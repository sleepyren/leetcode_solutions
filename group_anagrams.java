class Solution {
    /*
     This is the solution the the medium problem on Neetcode/Leetcode
    Link: https://leetcode.com/problems/group-anagrams/
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        
    HashMap<String, Integer> m = new HashMap<>();
    ArrayList<List<String>> answerList = new ArrayList<>();

        //for each string, sort letters, compare to hashmap, add to list
        char current[];

    for (int i =0; i < strs.length; i++)
    {
        current = strs[i].toCharArray();
        Arrays.sort(current);
        String sortedStr = new String(current);
        if (m.containsKey(sortedStr)==true)
            answerList.get(m.get(sortedStr)).add(strs[i]);
        else
            {
                m.put(sortedStr, answerList.size());
                ArrayList<String> word = new ArrayList<>();
                //word.add(sortedStr);
                word.add(strs[i]);
                //word.add()
               
                answerList.add(word);
            }
    }
    return answerList;
    }
}
//groupAnagrams medium O(N)
