/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        while(node.next.next != null){
            node.val = node.next.val;
            node = node.next;
        }
        // modify last second node
        // by importing value of last node into it
        // and modifying next to NULL
        node.val = node.next.val;
        node.next = null;
    }
}
