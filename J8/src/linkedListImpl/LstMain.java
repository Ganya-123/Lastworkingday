package linkedListImpl;

public class LstMain {
  public static void main(String[] args) {
    LinkedLst lst = new LinkedLst();
    lst.add(18);

    lst.add(4);
    lst.add(7);
    lst.insertAt(1, 89);
    lst.insertAtStart( 6);
    lst.add(2);
   lst.deleteAtPos(1);
    lst.display();
  }
}
