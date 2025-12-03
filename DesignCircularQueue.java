class MyCircularQueue {
    private int[] queue;
    private int size;
    int len;
    private int front = 0;
    private int back = -1;

    public MyCircularQueue(int k) {
        queue = new int[k];
        size = 0;
        len = k;
    }
    
    public boolean enQueue(int value) {
        if(size == len){
            return false;
        }

        back = (back+1)%len;
        queue[back] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(size == 0){
            return false;
        }

        front = (front+1)%len;
        size--;
        return true;

    }
    
    public int Front() {
        if(size == 0){
            return -1;
        }
        return queue[front];
    }
    
    public int Rear() {
        if(size == 0){
            return -1;
        }
        return queue[back];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == len;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */