class MyLinkedList {

    private Node head;
    private Node tail;
    
    private int size = 0;

    private class Node{
        private int val;
        private Node next;

        private Node(int val){
            this.val = val;
        }

        private Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

    public MyLinkedList() {
        this.size = 0;
    }
    
    public int get(int index) {
        if(index < 0 || index >= size){
            return -1;
        }

        Node temp = head;
        while(temp != null){
            if(index == 0){
                return temp.val;
            }
            temp = temp.next;
            index--;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        if(size == 0){
            node.next = null;
            head = node;
            tail = node;
        }
        else{
            node.next = head;
            head = node;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        if(size == 0){
            addAtHead(val);
            return;
        }
        Node node = new Node(val, null);
        tail.next = node;
        tail = node;
        size++;
    }
    
    public void addAtIndex(int indx, int val) {
        if(indx > size){
            return;
        }
        
        if(indx == 0){
            addAtHead(val);
            return;
        }

        if(indx == (size)){
            addAtTail(val);
            return;
        }

        Node temp = head;
        while(temp != null){
            if(indx == 1){
                Node node = new Node(val, temp.next);
                temp.next = node;
            }
            temp = temp.next;
            indx--;
        }
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(size == 0 || index >= size){
            return;
        }
        if(index == 0){
            deleteHead();
            return;
        }

        if(index == (size-1)){
            deleteTail();
            return;
        }

        Node temp = head;
        while(temp != null){
            if(index == 1){
                temp.next = temp.next.next;
            }
            temp = temp.next;
            index--;
        }
        size--;
    }

    private void deleteHead(){
        head = head.next;
        size--;
    }

    private void deleteTail(){
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
