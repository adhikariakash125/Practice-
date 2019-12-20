
//Initial Template for Java

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    static Node head;
    static Node lastNode;

    public static void addToTheLast(Node node) {
        if (head == null) {
            head = node;
            lastNode = node;
        } else {
            Node temp = head;
            lastNode.next = node;
            lastNode = node;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n, K;
            n = sc.nextInt();
            K = sc.nextInt();

            Node head = null;
            int val = sc.nextInt();
            head = new Node(val);
            addToTheLast(head);

            for (int i = 1; i < n; i++) {
                val = sc.nextInt();
                addToTheLast(new Node(val));
            }

            Node before[] = new Node[n];
            addressstore(before, head);
            GFG obj = new GFG();

            head = obj.swapkthnode(head, n, K);

            Node after[] = new Node[n];
            addressstore(after, head);

            if (check(before, after, n, K) == true)
                System.out.println("1");
            else
                System.out.println("0");

        }
    }

    static boolean check(Node before[], Node after[], int num, int K) {
        if (K > num)
            return true;

        return (before[K - 1] == after[num - K]) && (before[num - K] == after[K - 1]);


    }

    static void addressstore(Node arr[], Node head) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            arr[i] = temp;
            i++;
            temp = temp.next;
        }
    }

}

/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/* Linked List Node class
   class Node  {
     int data;
     Node next;
     Node(int data)
     {
         this.data = data;
         next = null;
     }
  }
*/
class GFG {
    // Should swap Kth node from beginning and
    // Kth node from end in list and return new head.
    Node swapkthnode(Node head, int num, int K) {
        try {

            if (K > num)
                return head;

            if (2 * K - 1 == num)
                return head;

            Node t1 = head;
            Node t2 = head;
            Node t1_prev = null, t2_prev = null, temp3 = null;

            for (int i = 0; i < K; i++) {
                t1_prev = t1;
                t1 = t1.next;
            }

            for (int j = 0; j < num - K + 1; j++) {
                t2_prev = t2.next;
                t2 = t2.next;
            }

            t1_prev.next = t2;
            t2_prev.next = t1;
            temp3 = t1;
            t1.next = t2.next;
            t2.next = temp3.next;

            return head;
        } catch (Exception e) {
            return head;
        }
    }
}
