class Node{
    int key;
    int val;
    Node prev;
    Node next;
    Node(int key, int val){
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}
class LRUCache {
    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);
    public HashMap<Integer,Node> hm;
    public int cap;

    public LRUCache(int capacity) {
        hm = new HashMap<>(capacity);
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(hm.containsKey(key)){
            Node nd = hm.get(key);
            nd = deleteNode(nd);

            nd = insertAtHead(nd);

            return nd.val;
        }
        return -1;
    }

    public Node insertAtHead(Node nd){
        nd.prev = head;
        nd.next = head.next;
        head.next = nd;
        nd.next.prev = nd;
        return nd;
    }

    public Node deleteNode(Node nd){
        nd.prev.next = nd.next;
        nd.next.prev = nd.prev;
        return nd;
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key)){
            Node nd = hm.get(key);
            nd = deleteNode(nd);
            nd = insertAtHead(nd);
            nd.val = value;
        }else{
            if(hm.size()== cap){
                Node del_node = tail.prev;
                deleteNode(del_node);
                hm.remove(del_node.key);
            }
            Node newNode = new Node(key,value);
            hm.put(key,newNode);
            newNode = insertAtHead(newNode);
        }

        
    }
}
