package interviewQuestions;

public class CountDigit {
  public static void main(String[] args) {
    int input=12;
    int count=0;
     while(input>0){
       input=input/10;
       count++;
     }
    System.out.println(count);
  }
}
