/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    public int getCount(Node head) {
        // code here
        if(head == null){
            return 0;
        }
        return getCount(head.next) + 1;
    }
}
