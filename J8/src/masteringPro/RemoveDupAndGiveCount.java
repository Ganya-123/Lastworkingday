package masteringPro;

public class RemoveDupAndGiveCount {
  public static void main(String[] args) {
    int arr[] = {0, 0, 1, 1, 1, 2};
    int out = removeDuplicatess(arr);
    System.out.println(out);
  }

  private static int removeDuplicatess(int[] arr) {
    int j=1;
    for(int i=1;i<arr.length;i++){
      if(arr[i-1]!=arr[i]){
        arr[j]=arr[i];
        j++;
      }
    }
    return j;
  }

  //not getting proper output see once
}
