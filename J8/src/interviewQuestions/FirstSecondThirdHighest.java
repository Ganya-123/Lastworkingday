package interviewQuestions;

public class FirstSecondThirdHighest {
  public static void main(String[] args) {
    int arr[] = {34, 5, 7, 54, 43, 1};
    int max1 = 0;
    int max2 = 0;
    int max3 = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max1) {
        max3 = max2;
        max2 = max1;
        max1 = arr[i];
      } else if (arr[i] > max2 && arr[i] < max1) {
        max3 = max2;
        max2 = arr[i];

      } else if (arr[i] > max3 && arr[i] < max2) {
        max3 = arr[i];
      }
    }
    System.out.println("maximun values are : " + max1 + " :" + max2 + " :" + max3);

  }
}
