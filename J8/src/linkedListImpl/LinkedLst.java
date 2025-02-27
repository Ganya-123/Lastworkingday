package linkedListImpl;

public class LinkedLst {

  Node head;


  public void add(int val) {
    Node node = new Node();
    node.data = val;
    if (head == null) {
      head = node;
    } else {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = node;
    }

  }

  public void insertAt(int index, int val) {
    Node node = new Node();
    node.data = val;

    Node temp = head;
    for (int i = 0; i < index - 1; i++) {
      temp = head.next;
    }
    node.next = temp.next;
    temp.next = node;
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  public void insertAtStart(int val) {
    Node node = new Node();
    node.data = val;
    node.next = head;
    head = node;
  }

  public void deleteAtPos(int pos) {
    Node temp = head;
    Node n1 = null;
    for (int i = 0; i < pos - 1; i++) {
      temp = head.next;
    }
   // n1 = temp.next;
    temp.next = temp.next.next;
  }
}
