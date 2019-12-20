package LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NthNodeFromLast {
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
        NthNodeFromLast ll = new NthNodeFromLast();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        while (n != 0) {
            String[] m = reader.readLine().split(" ");
            int a = Integer.parseInt(m[0]);
            int b = Integer.parseInt(m[1]);
            String[] s = reader.readLine().split(" ");
            int[] x = convertToInteger(s);
            ll = insertIntoLL(x, ll);
            nthElementFromLast(ll, a, b);
            n--;
        }
    }

    private static void nthElementFromLast(NthNodeFromLast ll, int a, int b) {
        if (b > a)
            System.out.println(-1);
        else {
            int pos = a - b;
            Node node = ll.head;
            for (int i = 0; i < pos; i++) {
                node = node.next;
            }
            System.out.println(node.data);
        }
    }

    private static NthNodeFromLast insertIntoLL(int[] x, NthNodeFromLast ll) {
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
