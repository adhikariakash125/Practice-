package LinkedList;

public class LengthOfLL {
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
        LengthOfLL lengthOfLL = new LengthOfLL();
        lengthOfLL = insertData(1,lengthOfLL);
        lengthOfLL = insertData(99,lengthOfLL);
        lengthOfLL = insertData(34,lengthOfLL);
        lengthOfLL = insertData(7,lengthOfLL);
        lengthOfLL = insertData(56,lengthOfLL);

        System.out.println(countLength(lengthOfLL));
    }

    private static int countLength(LengthOfLL lengthOfLL) {
        Node node = lengthOfLL.head;
        int counter = 0;
        while (node!=null){
            counter++;
            node = node.next;
        }
        return counter;
    }

    private static LengthOfLL insertData(int i, LengthOfLL lengthOfLL) {
        Node newNode = new Node(i);
        if (lengthOfLL.head==null)
            lengthOfLL.head = newNode;
        else {
            Node node = lengthOfLL.head;
            while (node.next!=null){
                node = node.next;
            }
            node.next = newNode;
        }
        return lengthOfLL;
    }
}