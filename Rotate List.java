/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // create a  circular linked list and calculate the size
    // go to (size - k)th Node 
    // break chain 
    // return next node
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr = head;
        int size = 1;
        while(curr.next != null){
            // find size
            size++;
            curr = curr.next;
        }
        curr.next = head; // create circular list

        k = k % size;//if k > size
        k = size - k;

        // go to (newHead - 1)th Node
        while(k != 1){
            head = head.next;
            k--;
        }

        curr = head;
        head = head.next;//new head
        curr.next = null;//disconnect Linked List
        return head;



    }
}
