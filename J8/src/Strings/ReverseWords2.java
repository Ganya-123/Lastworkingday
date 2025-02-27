package Strings;

public class ReverseWords2 {
  public static void main(String[] args) {
    String input = "a good   example";
    char[] inputArray = input.toCharArray();
    String output = "";
    int start = 0;
    for (int end = 0; end < input.length(); end++) {
      if (inputArray[end] == ' ') {
        String value = input.substring(start, end).trim();
        if(value.equals("")){
         start=end+1;
         continue;
        }
        else {
        output = " " +value+ output;
        start = end + 1;
      }}
    }
    String lastValue = input.substring(start, input.length());
    output = lastValue +  output;
    System.out.println(output.length());
    System.out.println("The output is"+":"+output.trim());
    System.out.println(output.length());
  }
}
