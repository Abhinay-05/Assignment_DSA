class MinStack {
    class Node{
        int data;
        int min;
        Node next;

        private Node(int val, int min){
            this.data = val;
            this.min = min;
            this.next = null;
        }

        private Node(int val, int min, Node n){
            this.data = val;
            this.min = min;
            this.next = n;
        }
    }
    Node head;
    public MinStack() {
        head = null;
    }
    
    public void push(int val) {
        if(head == null){
            head = new Node(val, val);
            return;
        }
        Node node = new Node(val, (head.min < val) ? head.min : val, head);
        head = node;
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.data;
    }
    
    public int getMin() {
        return head.min;
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