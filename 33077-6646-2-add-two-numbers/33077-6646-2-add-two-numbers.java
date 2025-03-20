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
        return getNodes(l1, l2, 0); 
    }

    public ListNode getNodes(ListNode l1, ListNode l2, int carry) {
        int val1;
        int val2;
        ListNode nextL1;
        ListNode nextL2;

        if (l1 != null)
            val1 = l1.val;
        else
            val1 = 0;

        if (l2 != null)
            val2 = l2.val;
        else
            val2 = 0;

        if (l1 != null) 
            nextL1 = l1.next;
        else 
            nextL1 = null;

        if (l2 != null) 
            nextL2 = l2.next;
        else 
            nextL2 = null;

        int sum = val1 + val2 + carry;
        carry = sum / 10;
        int digit = sum % 10;

        ListNode node = new ListNode(digit);

        if (nextL1 != null || nextL2 != null || carry != 0) {
            node.next = getNodes(nextL1, nextL2, carry);
        }
        return node;
    }
}