public class SinglyLinkedList {
    class Node {
        int val;
        Node next;

        public Node() {

        }

        public Node(int val) {
            this.val = val;
        }
    }

    Node head;
    int size;

    /**
     * Initialize your data structure here.
     */
    public SinglyLinkedList() {
        head = new Node();
        size = 0;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node curr = head.next;
        while (index > 0) {
            index--;
            curr = curr.next;
        }
        return curr.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while (index > 0) {
            prev = curr;
            curr = curr.next;
            index--;
        }
        Node newNode = new Node(val);
        prev.next = newNode;
        newNode.next = curr;
        size++;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while (index > 0) {
            prev = curr;
            curr = curr.next;
            index--;
        }
        prev.next = curr.next;
        size--;
    }

    public static void main(String[] args) {
//          Your MyLinkedList object will be instantiated and called as such:
        SinglyLinkedList obj = new SinglyLinkedList();
        obj.addAtHead(1);
        obj.addAtTail(3);
        int param_1 = obj.get(0);
        obj.addAtIndex(1, 2);
        obj.deleteAtIndex(1);
    }
}
