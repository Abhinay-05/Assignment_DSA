class myQueue {
    
    int[] arr;
    
    int back = -1;

    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        arr = new int[n];
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return back == (-1);
    }

    public boolean isFull() {
        // Check if queue is full
        return (back+1) == arr.length;
    }

    public void enqueue(int x) {
        // Enqueue
        if(back+1 != arr.length){
            arr[++back] = x;
        }
    }

    public void dequeue() {
        // Dequeue
        if(back != (-1)){
            for(int i = 0 ; i < arr.length - 1 ; i++){
                arr[i] = arr[i+1];
            }
            back--;
        }
    }

    public int getFront() {
        // Get front element
        if(back != (-1)){
            return arr[0];
        }
        return -1;
    }

    public int getRear() {
        // Get last element
        if(back != (-1)){
            return arr[back];
        }
        return -1;
    }
}
    
