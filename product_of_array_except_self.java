class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        //we need to arrays for the "better than O(n^2) solution"
        /*
        Basically, this question is asking me to find 
        the product of every element in the array except 5

        I can use a "prefix" and "suffix" array
        prefix array = multiplication of all earlier elements
        ex) [1, nums[0], nums[0] * nums[1], nums[0] * nums[1] * nums[2] ...]
        */

        int[] answerArr = new int[nums.length]; 
        int[] prefixArr = new int[nums.length]; prefixArr[0] = 1;
        int[] suffixArr =  new int[nums.length]; suffixArr[nums.length-1] = 1;

        for (int i = 1; i < nums.length; i++)
        {
            prefixArr[i] = prefixArr[i-1] * nums[i-1];
        } //prefixArr[nums.length-1] = prefixArr[nums.length-2];
        for (int i = nums.length-2; i >= 0; i--)
        {
            suffixArr[i] = suffixArr[i+ 1] * nums[i + 1];
        } //suffixArr[0] = suffixArr[1];

        for (int i = 0; i < nums.length; i++)
        {
            answerArr[i] = prefixArr[i] * suffixArr[i];
        }
        return answerArr;
    }
}
//productExceptSelf medium O(N)
