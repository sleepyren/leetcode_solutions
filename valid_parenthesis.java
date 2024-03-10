class Solution {
    public boolean isValid(String s) {
        char[] valids = {'(',')','[',']','{','}'};
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 6; i++)
          map.put(valids[i], i);
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++)
        {
          if (s.charAt(i) == valids[0]|| s.charAt(i) == valids[2] || s.charAt(i) == valids[4])
          stack.push(s.charAt(i));

          if (s.charAt(i) == valids[1]|| s.charAt(i) == valids[3]
           || s.charAt(i) == valids[5]){
            
            if (stack.empty()) return false;

            if (s.charAt(i) != valids[map.get(stack.peek())+1]) return false;
            else {stack.pop();}
        }
        }
        if (!stack.empty()) return false;
        return true;
}
}
//valid_parenthesis easy O(N)
