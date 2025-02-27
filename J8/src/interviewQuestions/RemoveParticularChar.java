package interviewQuestions;

public class RemoveParticularChar {
  public static void main(String[] args) {
    String input="Ganyagowda";
    char[] array=input.toCharArray();
    for(int i=0;i<array.length;i++){
      if(array[i]=='G' || array[i]=='g'){
       // array[i]='';
      }
    }
    System.out.println(array);
  }
}
