package interviewQuestions;

public class Decimal {

  public static void main(String[] args) {
//    int value = 0100;
//    int count = 0;
//    double decimal = 0;
//    while (value > 0) {
//      int rem = value % 10;
//      value = value / 10;
//
//      decimal += Math.pow(2, count) * rem;
//      count++;
//    }
//    System.out.println(decimal);
    String value="10001";
    double decimal=0;
    int count=0;
    for(int i=value.length()-1;i>=0;i--){
      int individualVal=Character.getNumericValue(value.charAt(i));

      decimal+=Math.pow(2,count)*individualVal;
      count++;
    }
    System.out.println(decimal);
  }
}
