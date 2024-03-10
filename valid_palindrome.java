class Solution {
    public boolean isPalindrome(String s) {
        
    String lowered_s = s.toLowerCase();
    ArrayList<Character> alphanumeric_s = new ArrayList<>();
    for (int i = 0; i < s.length(); i++)
{if (Character.isLetterOrDigit(s.charAt(i))) 
alphanumeric_s.add(lowered_s.charAt(i));}

    for (int i = 0; i < alphanumeric_s.size(); i++)
    {

    int forward_char = (int) alphanumeric_s.get(i);
    int backwards_char = (int) alphanumeric_s.get(alphanumeric_s.size()-1 - i);

if (forward_char != backwards_char) return false;
    }
    return true;
    }
}
//valid_palindrome easy O(N)
