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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1, l2, 0);
    }
    private ListNode add(ListNode l1, ListNode l2, int carry){
        if(l1 == null && l2 == null){
            if(carry == 0){
                return null;
            }
            return new ListNode(carry);
        }
        int sum = carry;
        if(l1 != null){
            sum += l1.val;
        }
        if(l2 != null){
            sum += l2.val;
        }
        carry = (sum >= 10)? 1 : 0;
        sum = sum % 10;

        ListNode node = new ListNode(sum);
        node.next = add((l1 == null)?l1:l1.next, (l2 == null)?l2:l2.next, carry);
        return node;
    }
}
