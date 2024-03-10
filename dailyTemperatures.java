/*
class Solution {
    //This is the O(N^2) solution
    //simply brute forcing to see which temps are greater than i 
    //for each i
    public int[] dailyTemperatures(int[] temperature) {
    int[] answer = new int[temperature.length];
    for (int i = 0; i < temperature.length; i++)
    {
        int days_until = 1;
        while (i + days_until <= temperature.length)
        {
            if (i + days_until == temperature.length) 
            {answer[i]=0; break;}
            
            if (temperature[i] < temperature[i + days_until])
            {answer[i] = days_until; break;}

        days_until++;
        }
    }
    return answer;
    }
}
dailyTemperatures medium O(N^2)*/

//This is an O(N) solution using the monotonic stack data structure
//it iterates through the list and since each element is popped or 
//pushed at most once it is O(N)
class Solution {
    HashMap<Integer, LinkedList<Integer>> map = new HashMap<>();
    public int[] dailyTemperatures(int[] temperature) {
    int[] answer = new int[temperature.length];
    Stack<Integer> stack = new Stack();
    for (int i = 0; i < temperature.length; i++)
    {
        while (!stack.empty() && temperature[i] > temperature[stack.peek()])
        {
            int element = stack.pop();
            answer[element] = i - element;
        }
        if (stack.empty()) answer[i] = 0; //0 means not found
        stack.push(i);
    }
    return answer;
    }
} 
//dailyTemperatures medium O(N)
