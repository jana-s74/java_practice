class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // CREATE (Insert at End)
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // READ (Display)
    public void display() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // UPDATE
    public void update(int oldValue, int newValue) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == oldValue) {
                temp.data = newValue;
                System.out.println("Updated Successfully");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Value Not Found");
    }

    // DELETE
    public void delete(int value) {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head.data == value) {
            head = head.next;
            System.out.println("Deleted Successfully");
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value Not Found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Deleted Successfully");
        }
    }

    // Check Cycle (Floyd's Algorithm)
    public boolean hasCycle() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    // Create Cycle (For Testing)
    public void createCycle() {
        if (head == null)
            return;

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = head.next; // Last node points to second node
    }
}

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        // CREATE
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        // READ
        System.out.println("Original List:");
        list.display();

        // UPDATE
        list.update(20, 25);
        list.display();

        // DELETE
        list.delete(30);
        list.display();

        // Check Cycle
        System.out.println("Cycle Present: " + list.hasCycle());

        // Create Cycle
        list.createCycle();

        // Check Again
        System.out.println("Cycle Present After Creating Cycle: " + list.hasCycle());
    }
}
head=head.next;}
}
class ListNode{
    int data;
    List node next;
    ListNode(int data){
        this.data=data;
        this.next=null;
    }
}
public class DeletewNodeLinkedList{
    public static void deleteNode(ListNode node){
        public class DeletewNodeLinkedList{
            note.data=node.next.data;
            node.next=node.next.next;
    }
    public static void main(String[] args){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        System.out.println("Original Linked List:");
        printList(head);
        deleteNode(head.next.next); // Deleting node with value 3
        System.out.println("Linked List after deleting node with value 3:");
        printList(head);
    }
}