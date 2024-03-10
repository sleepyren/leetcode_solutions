class MinStack {
    int[] stack;
    int[] min_stack;
    int location = -1;
    //the solution here is to use two stacks
    //one stack for the actual stack operations
    //another stack that holds the minimum value stored for O(1)
    public MinStack() {
    stack = new int[30_000];
    min_stack = new int[30_000];
    }
    
    public void push(int val) {
        location++; 
        stack[location] = val;
        if (location == 0)
        min_stack[location] = val;

        else 
min_stack[location] = (val < min_stack[location-1]) ? val : min_stack[location-1];
        
    }
    
    public void pop() {
    stack[location] = 0; min_stack[location] = 0;
    location--;
    }
    
    public int top() {
    return stack[location];
    }
    
    public int getMin() {
    return min_stack[location];
    }
}

//minStack medium O(1)
