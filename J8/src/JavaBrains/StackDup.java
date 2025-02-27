package JavaBrains;

public class StackDup {
  private int stackSize;
  private int[] stack;
  private int top;

  public StackDup(int stackSize) {
    this.stackSize = stackSize;
    this.stack = new int[stackSize];
    this.top = -1;
  }

  public void push(int input) {
    if (isFull()) {
      throw new RuntimeException("Stack is Full");
    }
    stack[++top] = input;

  }

  public int pop() {
    if (isEmpty()) {
      throw new RuntimeException("Stack is empty");
    }
    return stack[top--];
  }

  public int peek() {
    if (isEmpty()) {
      throw new RuntimeException("Stack is empty");
    }
    return stack[top];
  }

  boolean isFull() {
    return top == stackSize - 1;
  }

  boolean isEmpty() {
    return top == -1;
  }

  public static void main(String[] args) {
    StackDup stackDup = new StackDup(5);
    stackDup.push(10);
    stackDup.push(20);
    stackDup.push(30);
    stackDup.push(40);
    stackDup.push(50);

    System.out.println("Popped element: " + stackDup.pop());

    System.out.println("Top element: " + stackDup.peek());

  }
}
