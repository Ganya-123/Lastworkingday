package interviewQuestions;

public class MissingElementArray {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4,5, 7, 8, 9};
    int total = (9 * (9 + 1)) / 2;//to find total from 1 to 9
    int arraySum = 0;
    for (int i = 0; i < arr.length; i++) {
      arraySum = arraySum + arr[i];
    }
int missingElement=total-arraySum;
    System.out.println(missingElement);
  }
}
