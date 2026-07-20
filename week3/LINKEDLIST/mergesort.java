import java.util.Scanner;

// Node class for the linked list
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class mergesort {

    // Create a linked list from an array
    static ListNode createLinkedList(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Find the middle of the linked list (slow-fast pointer)
    static ListNode getMiddle(ListNode head) {
        if (head == null) return null;

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow is the middle node
    }

    // Merge two sorted linked lists
    static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Attach the remaining nodes
        if (l1 != null) current.next = l1;
        else            current.next = l2;

        return dummy.next;
    }

    // Merge Sort on linked list
    static ListNode mergeSort(ListNode head) {
        // Base case: 0 or 1 element
        if (head == null || head.next == null) return head;

        // Split the list into two halves
        ListNode mid = getMiddle(head);
        ListNode secondHalf = mid.next;
        mid.next = null; // Cut the list in half

        // Recursively sort each half
        ListNode left  = mergeSort(head);
        ListNode right = mergeSort(secondHalf);

        // Merge and return
        return merge(left, right);
    }

    // Print the linked list
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println(" -> null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ListNode head = createLinkedList(arr);

        System.out.print("\nOriginal List:  ");
        printList(head);

        head = mergeSort(head);

        System.out.print("Sorted List:    ");
        printList(head);

        sc.close();
    }
}