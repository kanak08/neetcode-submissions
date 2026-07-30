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
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode s_start = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode curr = s_start;

        while(curr!=null){
            ListNode newHead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newHead;
        }

        ListNode left = head;
        ListNode right = prev;
        while(left != null && right != null){
            ListNode l = left.next;
            ListNode r = right.next;
            left.next = right;
            right.next = l;

            left = l;
            right = r;
        }

        // if(left != null){}
        
    }
}
