package Strings;

public class ReverseTry {
  public static void main(String[] args) {
    String value ="Ganya ht gowda";
    System.out.println(value);

    char[] charArray=value.toCharArray();
    int end=0;
    int start=0;
    for(int i=0;i<charArray.length;i++){

      if(charArray[i]==' '){
        end=i;

        reverse(charArray,start,end-1);
start=end+1;

      }

    }
    reverse(charArray,start,charArray.length-1);
    System.out.println(new String(charArray));
  }
  public static void reverse(char[] charArray, int start, int end){
    while (start<end){
      char temp=charArray[end];
      charArray[end]=charArray[start];
      charArray[start]=temp;
      start++;
      end--;
    }
  }


}
