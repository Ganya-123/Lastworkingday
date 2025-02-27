package Demo;

public class Test {
  public static void main(String[] args) throws Exception {
    method();
  }

  static void method() throws Exception {
    throw new Exception("Checked Exception");
  }
}
