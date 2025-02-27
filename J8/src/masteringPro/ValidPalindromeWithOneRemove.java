// package masteringPro;
//
// import java.util.HashMap;
//
// public class ValidPalindromeWithOneRemove {
//  public static void main(String[] args) {
//    String input = "abca";
//    Boolean output = checkValidPalindrome(input);
//  }
//
//  private static Boolean checkValidPalindrome(String input) {
//    HashMap<Character, Integer> map = new HashMap<>();
//    for (int i = 0; i < input.length(); i++) {
//      if (map.containsKey(input.charAt(i))) {
//        map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
//      } else {
//        map.put(input.charAt(i), 1);
//      }
//    }
//  }
// }
