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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            // if both are null
            return null;
        }
        if(list1 == null){
            // if just list1 is null
            return list2;
        }
        if(list2 == null){
            // if just list2 is null
            return list1;
        }

        ListNode dum = new ListNode(-101);
        ListNode curr = dum;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                curr.next = list1;
                list1 = list1.next;
            }
            else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        if(list1 == null){
            list1 = list2;
        }
        curr.next = list1;
        return dum.next;
    }
}
