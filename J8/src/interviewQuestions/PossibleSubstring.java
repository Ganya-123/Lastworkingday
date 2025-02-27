package interviewQuestions;

public class PossibleSubstring {
  public static void main(String[] args) {
    String value="Ganya";
    for(int i=0;i<value.length();i++){
      for(int j=i+1;j<=value.length();j++){
        String result=value.substring(i,j);
        System.out.println(result);
      }
    }
  }
}
