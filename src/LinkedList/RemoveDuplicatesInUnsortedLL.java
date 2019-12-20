package LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class RemoveDuplicatesInUnsortedLL {
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
        RemoveDuplicatesInUnsortedLL ll = new RemoveDuplicatesInUnsortedLL();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        while (n != 0) {
            int m = Integer.parseInt(reader.readLine());
            String[] s = reader.readLine().split(" ");
            int[] x = convertToInteger(s);
            ll = insertIntoLL(x, ll);
            ll = removeDuplicates(ll, m);
            printLL(ll);
        }
    }

    private static void printLL(RemoveDuplicatesInUnsortedLL ll) {
        Node node = ll.head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    private static RemoveDuplicatesInUnsortedLL removeDuplicates(RemoveDuplicatesInUnsortedLL ll, int m) {
        HashSet<Integer> hashSet = new HashSet<>();
        Node node = ll.head;
        Node temp = null;
        while (node!=null){
            if (hashSet.contains(node.data)){
                temp.next = node.next;
            }else {
                hashSet.add(node.data);
                temp = node;
            }
            node = node.next;
        }
      return ll;
    }

    private static RemoveDuplicatesInUnsortedLL insertIntoLL(int[] x, RemoveDuplicatesInUnsortedLL ll) {
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

