import java.util.HashMap;
import java.util.Map;

public class TwoAdd {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l1.val == 0 && l1.next == null ) {
            return l2;
        }
        if (l2 == null || l2.val == 0 && l2.next == null) {
            return l1;
        }

        ListNode head = null, tail = null;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;

            if (head == null) {
                tail = new ListNode((val1 + val2 + carry) % 10);
                head = tail;
            } else {
                tail.next = new ListNode((val1 + val2 + carry) % 10);
                tail = tail.next;
            }
            carry = (val1 + val2 + carry) / 10;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(1);
        }




        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(9);
        ListNode n2 = new ListNode(4, n1);
        ListNode n3 = new ListNode(2, n2);
        ListNode n4 = new ListNode(9);
        ListNode n5 = new ListNode(9, n4);
        ListNode n6 = new ListNode(9, n5);

        addTwoNumbers(n3, n6);

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    
}
