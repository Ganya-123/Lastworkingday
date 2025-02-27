package linkedListImpl;

public class PalindromeLinkedList {

  public boolean isPalindrome(ListNode head) {
    if (head == null || head.next == null) return true;

    // Step 1: Find the middle using slow and fast pointers
    ListNode slow = head, fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    // Step 2: Reverse the second half
    ListNode secondHalf = reverseList(slow);
    ListNode firstHalf = head;

    // Step 3: Compare both halves
    ListNode temp = secondHalf;
    while (temp != null) {
      if (firstHalf.val != temp.val) return false;
      firstHalf = firstHalf.next;
      temp = temp.next;
    }

    return true;
  }

  // Reverse linked list helper function
  private ListNode reverseList(ListNode head) {
    ListNode prev = null, next;
    while (head != null) {
      next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }
    return prev; // New head of the reversed list
  }

  // Helper function to create a linked list from an array
  public static ListNode createList(int[] values) {
    if (values.length == 0) return null;
    ListNode head = new ListNode(values[0]);
    ListNode current = head;
    for (int i = 1; i < values.length; i++) {
      current.next = new ListNode(values[i]);
      current = current.next;
    }
    return head;
  }


  // Main function to run test cases
  public static void main(String[] args) {
    PalindromeLinkedList solution = new PalindromeLinkedList();

    // Test case 1: Palindrome list
    int[] values1 = {1, 2, 3, 2, 1};
    ListNode head1 = createList(values1);
    System.out.println("Is Palindrome? " + solution.isPalindrome(head1));

    // Test case 2: Not a palindrome
    int[] values2 = {1, 2, 3, 4, 5};
    ListNode head2 = createList(values2);
    System.out.println("Is Palindrome? " + solution.isPalindrome(head2));

    // Test case 3: Even-length palindrome
    int[] values3 = {1, 2,3,3, 2, 1};
    ListNode head3 = createList(values3);
    System.out.println("Is Palindrome? " + solution.isPalindrome(head3));

  }
}
