package LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseALL {
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
        ReverseALL ll = new ReverseALL();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        while (n != 0) {
            int m = Integer.parseInt(reader.readLine());
            String[] s = reader.readLine().split(" ");
            int[] x = convertToInteger(s);
            ll = insertIntoLL(x, ll);
            ll = reverseALL(ll);
            print(ll);
            n--;
        }
    }

    private static void print(ReverseALL ll) {
        Node node = ll.head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    private static ReverseALL reverseALL(ReverseALL ll) {
        Node prev = null;
        Node curr = ll.head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ll.head = prev;
        return ll;
    }

    private static ReverseALL insertIntoLL(int[] x, ReverseALL ll) {
        for (int i = 0; i < x.length; i++) {
            Node new_node = new Node(x[i]);
            if (ll.head == null)
                ll.head = new_node;
            else {
                Node node = ll.head;
                while (node.next != null) {
                    node = node.next;
                }
                node.next = new_node;
            }
        }
        return ll;
    }

    private static int[] convertToInteger(String[] s) {
        int x[] = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            x[i] = Integer.parseInt(s[i]);
        }
        return x;
    }
}
