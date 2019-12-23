package LinkedList;

public class RemoveLoopFromLL {
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
        RemoveLoopFromLL ll = new RemoveLoopFromLL();
        ll = insertIntoLL(ll, 1);
        ll = insertIntoLL(ll, 54);
        ll = insertIntoLL(ll, 67);
        ll = insertIntoLL(ll, 34);
        ll = insertIntoLL(ll, 99);
        ll.head.next.next.next.next.next = ll.head.next;
       findLoop(ll);
    }

    private static void printLL(RemoveLoopFromLL ll) {
        Node node = ll.head;
        while (node!=null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    private static void findLoop(RemoveLoopFromLL ll) {
        Node slow = ll.head;
        Node fast = ll.head;
        Node prev = null;
        while (fast.next!=null && fast!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast==slow)
                removeLoop(slow,ll);
        }
        return;
    }

    private static void removeLoop(Node slow, RemoveLoopFromLL ll) {
        slow.next = null;
        printLL(ll);
    }

    private static RemoveLoopFromLL insertIntoLL(RemoveLoopFromLL ll, int i) {
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
