class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class PostOrderTraversal {

    static void postOrder(Node root) {
        if (root == null)
            return;

        postOrder(root.left);   // Left
        postOrder(root.right);  // Right
        System.out.print(root.data + " "); // Root
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Postorder: ");
        postOrder(root);
    }
}