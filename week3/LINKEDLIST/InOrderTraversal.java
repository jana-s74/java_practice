class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class InOrderTraversal {

    static void inOrder(Node root) {
        if (root == null)
            return;

        inOrder(root.left);          // Left
        System.out.print(root.data + " "); // Root
        inOrder(root.right);         // Right
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Inorder: ");
        inOrder(root);
    }
}