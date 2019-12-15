package LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertionInDoublyLL {
    Node head;
    static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) throws IOException {
        InsertionInDoublyLL ll = new InsertionInDoublyLL();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        while (n!=0){
            int m = Integer.parseInt(reader.readLine());
            String[] s = reader.readLine().split(" ");
            int x[] = convertToIntegerType(s);
            for (int i=0;i<x.length;i++){
                insertData(x[i],ll);
            }
            String[] t = reader.readLine().split(" ");
            int p= Integer.parseInt(t[0]);
            int r= Integer.parseInt(t[1]);
            insertion(p,r,ll,m);
            n--;
        }
    }

    private static void printLL(InsertionInDoublyLL ll) {
        Node node = ll.head;
        while (node!=null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    private static void insertion(int p, int r, InsertionInDoublyLL ll, int m) {
        Node node = ll.head;
        Node new_node = new Node(r);
        for (int i=0;i<p && node.next!=null;i++){
            node = node.next;
        }
        new_node.next = node.next;
        new_node.prev = node;
        node.next = new_node;
        printLL(ll);
    }


    private static int[] convertToIntegerType(String[] s) {
        int x[] = new int[s.length];
        for (int i=0;i<s.length;i++) {
            x[i] = Integer.parseInt(s[i]);
        }
        return x;
    }

    private static InsertionInDoublyLL insertData(int i, InsertionInDoublyLL ll) {
        Node newNode = new Node(i);
        if (ll.head==null){
            ll.head = newNode;
            newNode.prev = newNode;
        }
        else {
            Node node = ll.head;
            while (node.next!=null){
                node = node.next;
            }
            node.next = newNode;
            newNode.prev = node;
        }
        return ll;
    }
}
