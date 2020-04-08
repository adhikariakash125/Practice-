package Trees;

class Node{
    int key;
    Node left,right;

    public Node(int item){
        key = item;
        left = right = null;
    }
}

class BinaryTree{
    Node root;

    BinaryTree(){
        root = null;
    }

    public void preOrderTraversal(Node node) {
            if (node == null)
                return;
        System.out.print(node.key+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

}
public class PreOrderTraversal {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        tree.preOrderTraversal(tree.root);
    }

}
