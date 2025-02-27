package interviewQuestions;

public class Ginterview {
  public static void main(String[] args) {
    String str="abc@!@#ehjk";
    String output="";
    for(int i=0;i<str.length();i++){
      char value=str.charAt(i);
      if(Character.isLetter(str.charAt(i))){
        output=value+output;
      }
    }
    System.out.println(output);
  }


}
