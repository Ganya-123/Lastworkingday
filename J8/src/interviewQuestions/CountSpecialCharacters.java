package interviewQuestions;

public class CountSpecialCharacters {
  public static void main(String[] args) {
    String value="Ganyaht@123%* ";
    int count=0;
    String output="";
    for (int i=0;i<value.length();i++){
      if(!Character.isDigit(value.charAt(i)) && !Character.isLetter(value.charAt(i)) && !Character.isWhitespace(value.charAt(i))){
        count=count+1;
      }
      else{
        output+=value.charAt(i);
      }
    }
    System.out.println("Total Special Characters are :"+count);
    System.out.println("Output String :"+output);
  }
}
