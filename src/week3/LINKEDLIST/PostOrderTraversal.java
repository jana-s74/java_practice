package week3.LINKEDLIST;

public class PostOrderTraversal {

    static void postOrder(TreeNode root) {
        if (root == null)
            return;

        postOrder(root.left);   // Left
        postOrder(root.right);  // Right
        System.out.print(root.data + " "); // Root
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.print("Postorder: ");
        postOrder(root);
    }
}