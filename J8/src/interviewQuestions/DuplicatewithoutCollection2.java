package interviewQuestions;

public class DuplicatewithoutCollection2 {
  public static void main(String[] args) {
    String input="Ganya Gowda";
    char[] charArray=input.toCharArray();
    for(int i=0;i<input.length();i++){
      int count=0;
      for(int j=0;j<input.length();j++){
        if(input.charAt(i)==charArray[j]){
          count=count+1;
          charArray[j]='0';
        }
      }
      if(count>1){
        System.out.println(input.charAt(i));
      }
    }
  }
}
