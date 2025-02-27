package interviewQuestions;

public class Atm {
  public static void main(String[] args) {
    int value=3800;
    int[] notes={2000,1000,500,200,100};
    for(int i=0;i<notes.length;i++){
      int quotient=0;
      if(value>=notes[i]){
        quotient=value/notes[i];


        System.out.println(notes[i]+":="+quotient);
        value=value%notes[i];
      }
    }
  }
}
