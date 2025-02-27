package interviewQuestions;

public class evenoddOrder {
  public static void main(String[] args) {
    int[] arr= new int[]{1, 3, 2, 4, 5};
    int[] output=new int[arr.length];
    int index=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2==0){
        output[index]=arr[i];
        index++;
      }
    }
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2!=0){
        output[index]=arr[i];
        index++;
      }
    }
    for(int num:output){
      System.out.println(num);
    }
  }
}
