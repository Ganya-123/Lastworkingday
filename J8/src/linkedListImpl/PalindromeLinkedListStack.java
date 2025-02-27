package linkedListImpl;

import java.util.Stack;

public class PalindromeLinkedListStack {
  public boolean isPalindrome(ListNode head) {
    Stack<Integer> stack = new Stack<>();
    ListNode temp = head;
    while (temp != null) {
      stack.push(temp.val);
      temp = temp.next;
    }
    temp = head;
    while (temp != null) {
      if (stack.pop() != temp.val) {
        return false;
      }
      temp = temp.next;
    }
    return true;
  }
}
