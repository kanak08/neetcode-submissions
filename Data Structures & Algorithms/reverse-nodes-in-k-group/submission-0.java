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
    public ListNode[] reverse(ListNode prev, ListNode tmp, int k){
        while(k!=0){
            ListNode nd = tmp.next;
            tmp.next = prev;
            prev = tmp;
            tmp = nd;
            k--;
        }
        ListNode[] response = new ListNode[2];
        response[0] = prev;
        response[1] = tmp;
        return response;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev = null;
        ListNode result = new ListNode(-1);
        result.next = head;
        ListNode tmp = head;
        int count = 0;

        ListNode scan= head;
        while(scan!=null){
            scan=scan.next;
            count++;
        }

        int ite = count/k;
        ListNode[] resp = new ListNode[2];
        while(tmp!=null && ite>0){
            resp = reverse(prev, tmp, k);
            if(prev!=null){prev.next = resp[0];}
            else{result.next=resp[0];}
            tmp.next = resp[1];
            prev = tmp;
            tmp = tmp.next;
            ite--;
        }

        if(tmp!=null){prev.next=resp[1];}
        return result.next;

        
    }
}
