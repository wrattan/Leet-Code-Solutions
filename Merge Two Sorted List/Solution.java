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
        if(list1 == null){
            return list2;
        }else if(list2 == null){
            return list1;
        }
        ListNode list3 = null;
        if(list1.val <= list2.val){
            list3 = list1;
            list1 = list1.next;
        }else{
            list3 = list2;
            list2 = list2.next;
        }
        ListNode list4 = list3;


    while (list1 != null && list2 != null) {
      ListNode temp = null;
      if (list1.val <= list2.val) {
        temp = list1;
        list1 = list1.next;
      } else {
        temp = list2;
        list2 = list2.next;
      }

      list4.next = temp;
      list4 = temp;
    }

    if (list1 != null) {
      list4.next = list1;
    } else if (list2 != null) {
      list4.next = list2;
    }

    return list3;
    }
}