class Solution {
    public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    int[] alphabet1 = new int[26];
    int[] alphabet2 = new int[26];
    //O(N) tC -> count the letters in each and compare
    for (int i = 0; i < s.length(); i++)
    {
        alphabet1[s.charAt(i) - 'a']++;
        alphabet2[t.charAt(i) - 'a']++;
    }

    for (int i = 0; i < 26; i++)
    {
    if (alphabet1[i]!=alphabet2[i]) return false;
    }
return true;
    }
}
//validAnagram easy O(N)
