package LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveDuplicates {
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
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        RemoveDuplicates ll = new RemoveDuplicates();
        int n = Integer.parseInt(reader.readLine());
        while (n != 0) {
            int m = Integer.parseInt(reader.readLine());
            String[] s = reader.readLine().split(" ");
            int[] x = convertToInteger(s);
            ll = insertIntoLL(x, ll);
            ll = removeDuplicates(ll);
            printLL(ll);
            n--;
        }

    }

    private static void printLL(RemoveDuplicates ll) {
        Node node = ll.head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    private static RemoveDuplicates removeDuplicates(RemoveDuplicates ll) {
        Node node = ll.head;
        while (node.next != null) {
            if (node.data == node.next.data) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return ll;
    }

    private static RemoveDuplicates insertIntoLL(int[] x, RemoveDuplicates ll) {
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
