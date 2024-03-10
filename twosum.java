/*
 This is an O(n) solution. Given the number, target, as I go through the array I am putting each one in a HashMap for an instant lookup, and they are paired with their index as the value because the answer is looking for the INDEX. Next, I iterate through the list again and this time I note the complement of each element (target - element = complement ). If the complement is present too we've found our answer. Regarding the middlenum variable and clauses: it was added because a HashMap cannot contain more than one value per key so if the target was 10 , the valid answer [5, 5] would never be found. 
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
    
    HashMap<Integer, Integer> num_to_index= new HashMap<>();
    int middle_num;
    middle_num = target % 2 == 0 ? target / 2 : 0;

    ArrayList<Integer> midpoint_indices = new ArrayList<>();
    
    for (int i = 0; i < nums.length; i++)
    {
        if (nums[i]==middle_num && middle_num != 0)
        midpoint_indices.add(i);
        else
        num_to_index.put(nums[i],i);
    }

    if (midpoint_indices.size() > 1 )
    {
        int[] ans = new int[2];
        ans[0] = midpoint_indices.get(0);
        ans[1] = midpoint_indices.get(1);
        return ans;
    }
    for (int i = 0; i < nums.length; i++)
    {
        int complement = target - nums[i];
        if (num_to_index.containsKey(complement)) 
        {
        int[] ans = new int[2];
        ans[0] = i;
        ans[1] = num_to_index.get(complement);
        return ans;
        }
    }
    
    return null;
    }
}
/*
 This was the old O(n^2) brute force solution


class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] temp_arr = new int[2]; 
        for (int i = 0; i < nums.length-1; i++)
        {
        temp_arr[0] = i;
        int temp_target = target - nums[i];
        for (int j =i+1; j < nums.length;j++)
        {
        if (nums[j] == temp_target) {temp_arr[1] = j; return temp_arr;}
        } 
        }
        
        return null;
        }



    }
*/

//twosum easy O(N)
