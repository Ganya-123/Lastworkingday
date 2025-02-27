package sadu;

public class prime {
  public static void main(String[] args) {
    int input = 11;


    Boolean result=isprimee(input);
    if(result){
      System.out.println("result = " + result);
    }
else {
      System.out.println("result = " + result);
    }
  }

  private static Boolean isprimee(int input) {
    for (int i = 2; i < input / 2; i++) {
      if(input%i==0){
        return false;
      }
    }
    return true;
  }
}
