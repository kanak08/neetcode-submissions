/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node tmp = head;
        if(head == null){return head;}
        while(tmp != null){
            Node newNode = new Node(tmp.val);
            Node x = tmp.next;
            tmp.next = newNode;
            newNode.next = x;
            tmp = x;
        } 
        tmp = head;
        while(tmp != null){
            if(tmp.random != null){
                Node copy = tmp.next;
                copy.random = tmp.random.next;
            }

            if(tmp.next==null){break;}
            tmp = tmp.next.next;
        }

        Node resp = new Node(-1);
        tmp = head;
        resp.next = tmp.next;
        Node a = resp;
        while(tmp != null){
            Node a_2 = tmp.next;

            a.next = tmp.next;
            tmp.next = tmp.next.next;

            a = a.next;
            tmp = tmp.next;
        }

        return resp.next;
        
    }
}
