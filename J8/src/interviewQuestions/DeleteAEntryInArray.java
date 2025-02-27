package interviewQuestions;

public class DeleteAEntryInArray {
  public static void main(String[] args) {
    int array[] = {1, 5, 3, 6, 9};
    int[] arr2 = new int[array.length-1];
    int deleteValue = 6;
    int count=0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] != deleteValue) {
        arr2[count] = array[i];
        count++;
      }

    }
    for (int num : arr2) {
      System.out.print(num + " ");
    }
  }
}
