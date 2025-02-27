package interviewQuestions;

public class ReverseIndividually {
  public static void main(String[] args) {
    String name="Ganya";
    char[] array=name.toCharArray();
    int start=0;
    int end=0;
    for(int i=0;i<name.length();i++){

      if(name.charAt(i)==' '){
        end =i;
        reverseString(array,start,end-1);
        start=end+1;
      }
    }
    reverseString(array,start,array.length-1);
    System.out.println(array);
  }

  private static void reverseString(char[] array, int start, int end) {
    while(start<end){
      char temp=array[start];
      array[start]=array[end];
      array[end]=temp;
      start++;
      end--;
    }
  }
}
