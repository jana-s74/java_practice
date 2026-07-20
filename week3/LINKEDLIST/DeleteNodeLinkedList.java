class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteNodeLinkedList {

    public static void deleteNode(ListNode node) {

        if (node == null || node.next == null) {
            return;
        }

        node.data = node.next.data;
        node.next = node.next.next;
    }

    public static void display(ListNode head) {

        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);

        System.out.println("Before Deletion:");
        display(head);

        // Delete node with value 20
        deleteNode(head.next);

        System.out.println("After Deletion:");
        display(head);
    }
}