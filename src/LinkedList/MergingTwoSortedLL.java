package LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MergingTwoSortedLL {

    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // TODO : Incomplete Code
    public static void main(String[] args) throws IOException {
        MergingTwoSortedLL ll = new MergingTwoSortedLL();
        MergingTwoSortedLL ll1 = new MergingTwoSortedLL();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        while (n != 0) {
            String[] m = reader.readLine().split(" ");
            String[] s = reader.readLine().split(" ");
            int[] x = convertToInteger(s);
            ll = insertIntoLL(x, ll);
            String[] t = reader.readLine().split(" ");
            int[] y = convertToInteger(t);
            ll1 = insertIntoLL(y, ll1);
            printLL(ll);
        }

    }

    private static void printLL(MergingTwoSortedLL ll) {
        Node node = ll.head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    private static MergingTwoSortedLL insertIntoLL(int[] x, MergingTwoSortedLL ll) {
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
