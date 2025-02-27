package JavaBrains;

public class TargetSum {
  public static void main(String[] args) {
    int target = 17;
    int array[] = {2, 7, 11, 15};
    for (int i = 0; i < array.length; i++) {
      for (int j = i+1; j < array.length; j++) {
        int sum = array[i] + array[j];
        if (sum == target){
          System.out.println(i+":"+j);
        }

      }
    }
  }
}
