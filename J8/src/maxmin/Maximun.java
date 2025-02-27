package maxmin;

import java.util.HashMap;

public class Maximun {
  public static void main(String[] args) {
    int[] array = {10,11,4,77,8};
    int max = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;
    for(int i=0;i<array.length;i++){
      if(array[i]>max){
        max2=max;
        max=array[i];
      } else if (array[i]>max2 && array[i]<max){
        max2=array[i];
      }
    }
    System.out.println(max);
    System.out.println(max2);
  }
}
