class MinStack {
    Stack<List<Integer>> stack;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        int min;
        if(stack.isEmpty()){
            min = val;
        }else{
            min = Math.min(stack.peek().get(1), val);
        }
        stack.push(new ArrayList<Integer>(List.of(val, min)));
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().get(0);
    }
    
    public int getMin() {
        return stack.peek().get(1);
    }
}
