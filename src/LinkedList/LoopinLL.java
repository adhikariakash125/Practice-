package LinkedList;

import javax.print.attribute.standard.NumberUp;

public class LoopinLL {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        LoopinLL ll = new LoopinLL();
        ll = insertIntoLL(ll, 1);
        ll = insertIntoLL(ll, 54);
        ll = insertIntoLL(ll, 1);
        ll = insertIntoLL(ll, 1);
        ll.head.next.next.next.next = ll.head.next;
        System.out.println(checkForLoop(ll));
    }

    private static int lengthOfLoopinLL(Node node) {
        Node slow = node;
        slow = slow.next;
        int counter = 1;
        while (slow != node) {
            counter++;
            slow = slow.next;
        }
        return counter;
    }

    private static int checkForLoop(LoopinLL ll) {
        Node slow = ll.head, fast = ll.head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return lengthOfLoopinLL(slow);
        }
        return -1;
    }

    private static LoopinLL insertIntoLL(LoopinLL ll, int i) {
        Node new_node = new Node(i);
        if (ll.head == null)
            ll.head = new_node;
        else {
            Node t = ll.head;
            while (t.next != null) {
                t = t.next;
            }
            t.next = new_node;
        }
        return ll;
    }
}
