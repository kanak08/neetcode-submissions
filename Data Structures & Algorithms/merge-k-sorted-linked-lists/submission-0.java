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
    public ListNode mergeKLists(ListNode[] lists) {
        // if(lists.length==0){return lists;}

        ListNode resp = new ListNode(-1);
        ListNode temp = resp;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);

        for(int i=0;i<lists.length;i++){
            ListNode ls = lists[i];
            pq.offer(ls);
        }
        while(!pq.isEmpty()){
            ListNode nd = pq.poll();
            temp.next = nd;
            temp = temp.next;

            if(nd.next!=null){pq.offer(nd.next);}
            nd.next = null;
        }

        return resp.next;

    }
}
