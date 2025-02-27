package interviewQuestions;

public class NextGreaterElement {
  public static void main(String[] args) {
    int arr[]={10,11,1,5,9};
    for(int i=0;i<arr.length;i++){
      int max=arr[i];
      for (int j=i+1;j<arr.length;j++){
        if(arr[j]>max){
          max=arr[j];
        }
      }
      System.out.println("next greater element for "+arr[i]+" is"+" = "+max);
    }
  }
}
