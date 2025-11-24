class MinStack {
    List<Integer> list;
    private int top = -1;
    private Stack<Integer> st;

    public MinStack() {
        list = new ArrayList<>();
        st = new Stack<>();
    }
    
    public void push(int val) {
        list.add(val);
        top++;
        if(st.isEmpty()){
            st.push(val);
            return;
        }
        st.push(st.peek() < val ? st.peek() : val);
        // adding everytime ensures that the minimum of every length is added
    }
    
    public void pop() {
        top--;
        list.removeLast();
        st.pop();
    }
    
    public int top() {
        return list.get(top);
    }
    
    public int getMin() {
        int len = list.size();
        return st.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */