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
    public ListNode middleNode(ListNode head) {
        ListNode head1 = head;
        ListNode head2 = head;
        while(head2!=null && head2.next!=null){
            head1 = head1.next;
            head2 = head2.next.next;
        }
        return head1;
        
    }
}