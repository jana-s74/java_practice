package week3.LINKEDLIST;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class InOrderTraversal {

    static void inOrder(TreeNode root) {
        if (root == null)
            return;

        inOrder(root.left);          // Left
        System.out.print(root.data + " "); // Root
        inOrder(root.right);         // Right
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.print("Inorder: ");
        inOrder(root);
    }
}