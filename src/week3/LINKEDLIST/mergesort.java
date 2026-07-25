package week3.LINKEDLIST;

import java.util.Scanner;

// Node class for the linked list
class MergeSortListNode {
    int val;
    MergeSortListNode next;

    MergeSortListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class mergesort {

    // Create a linked list from an array
    static MergeSortListNode createLinkedList(int[] arr) {
        if (arr.length == 0) return null;

        MergeSortListNode head = new MergeSortListNode(arr[0]);
        MergeSortListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new MergeSortListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Find the middle of the linked list (slow-fast pointer)
    static MergeSortListNode getMiddle(MergeSortListNode head) {
        if (head == null) return null;

        MergeSortListNode slow = head;
        MergeSortListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow is the middle node
    }

    // Merge two sorted linked lists
    static MergeSortListNode merge(MergeSortListNode l1, MergeSortListNode l2) {
        MergeSortListNode dummy = new MergeSortListNode(0);
        MergeSortListNode current = dummy;

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
    static MergeSortListNode mergeSort(MergeSortListNode head) {
        // Base case: 0 or 1 element
        if (head == null || head.next == null) return head;

        // Split the list into two halves
        MergeSortListNode mid = getMiddle(head);
        MergeSortListNode secondHalf = mid.next;
        mid.next = null; // Cut the list in half

        // Recursively sort each half
        MergeSortListNode left  = mergeSort(head);
        MergeSortListNode right = mergeSort(secondHalf);

        // Merge and return
        return merge(left, right);
    }

    // Print the linked list
    static void printList(MergeSortListNode head) {
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

        MergeSortListNode head = createLinkedList(arr);

        System.out.print("\nOriginal List:  ");
        printList(head);

        head = mergeSort(head);

        System.out.print("Sorted List:    ");
        printList(head);

        sc.close();
    }
}