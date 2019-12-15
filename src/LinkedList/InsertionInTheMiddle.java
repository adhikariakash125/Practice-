package LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertionInTheMiddle {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) throws IOException {
        InsertionInTheMiddle ll = new InsertionInTheMiddle();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        while (n != 0) {
            int m = Integer.parseInt(reader.readLine());
            String[] s = reader.readLine().split(" ");
            int x[] = convertToIntegerType(s);
            for (int i = 0; i < x.length; i++) {
                insertData(x[i], ll);
            }
            int p = Integer.parseInt(reader.readLine());
            insertIntoMiddle(ll,p);
            printll(ll.head);
            n--;
        }
    }

    private static void printll(Node ll) {
        while (ll!=null){
            System.out.println(ll.data + " ");
            ll = ll.next;
        }
    }

    private static void insertIntoMiddle(InsertionInTheMiddle ll, int p) {
        Node slow = ll.head;
        Node fast = ll.head;
        while (fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node middle_node = new Node(p);
        middle_node.next = slow.next;
        slow.next = middle_node;
    }

    private static InsertionInTheMiddle insertData(int i, InsertionInTheMiddle ll) {
        Node newNode = new Node(i);
        if (ll.head == null) {
            ll.head = newNode;
        } else {
            Node node = ll.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
        return ll;
    }

    private static int[] convertToIntegerType(String[] s) {
        int x[] = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            x[i] = Integer.parseInt(s[i]);
        }
        return x;
    }
}
