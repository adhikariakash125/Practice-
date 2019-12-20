package LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IdenticalLLorNot {
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
        IdenticalLLorNot ll = new IdenticalLLorNot();
        IdenticalLLorNot duplicateLL = new IdenticalLLorNot();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        while (n!=0){
            int m = Integer.parseInt(reader.readLine());
            String[] s = reader.readLine().split(" ");
            int[] x = convertToInteger(s);
            ll = insertIntoLL(x,ll);
            int k = Integer.parseInt(reader.readLine());
            String[] t = reader.readLine().split(" ");
            int[] y = convertToInteger(t);
            duplicateLL = insertIntoLL(y,duplicateLL);

            System.out.println(isIdentical(m,ll,k,duplicateLL));
        }
    }

    private static IdenticalLLorNot insertIntoLL(int[] x, IdenticalLLorNot ll) {
        for (int i=0;i<x.length;i++){
            Node new_node = new Node(x[i]);
            if (ll.head==null)
                ll.head = new_node;
            else {
                Node node = ll.head;
                while (node.next!=null){
                    node = node.next;
                }
                node.next = new_node;
            }
        }
        return ll;
    }

    private static boolean isIdentical(int m, IdenticalLLorNot ll, int k, IdenticalLLorNot duplicateLL) {
        if (m!=k)
            return false;
        else {
            Node node = ll.head;
            Node node1 = ll.head;
            while (node.next!=null && node1.next!=null){
                if (node.data==node1.data){
                    node = node.next;
                    node1 = node1.next;
                }
                else
                    return false;
            }
            return true;
        }
    }

    private static int[] convertToInteger(String[] s){
        int x[] = new int[s.length];
        for (int i=0;i<s.length;i++){
            x[i] = Integer.parseInt(s[i]);
        }
        return x;
    }
}
