package linkedListImpl;


class RemoveNthNode {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    int size = 0;
    ListNode node = head;

    // Count the total number of nodes
    while (node != null) {
      size++;
      node = node.next;
    }

    // If removing the first node (head)
    if (n == size) {
      return head.next;
    }

    int i = 0;
    ListNode temp = head;

    // Stop at the node before the one we want to remove
    while (i < size - n - 1) {
      temp = temp.next;
      i++;
    }

    // Check for null to prevent NullPointerException
    if (temp.next != null) {
      temp.next = temp.next.next;
    }

    return head;
  }

  // Helper method to print the linked list
  public static void printList(ListNode head) {
    ListNode temp = head;
    while (temp != null) {
      System.out.print(temp.val + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    // Create the linked list: 1 -> 2 -> 3 -> 4 -> 5
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    System.out.println("Original List:");
    printList(head);

    int n = 2; // Remove the 2nd node from the end

    RemoveNthNode solution = new RemoveNthNode();
    head = solution.removeNthFromEnd(head, n);

    System.out.println("Updated List after removing " + n + "th node from the end:");
    printList(head);
  }
}

