package interviewQuestions;

public class PasswordStrength {
  public static void main(String[] args) {
//    A password is said to be strong if it satisfies the following criteria:
//
//    It contains at least one lowercase English character.
//    It contains at least one uppercase English character.
//    It contains at least one special character. The special characters are: !@#$%^&*()-+
//      Its length is at least 8.
//    It contains at least one digit.
//    Given a string, find its strength. Let a strong password is one that satisfies all above conditions. A moderate password is one that satisfies first three conditions and has length at least 6. Otherwise password is week.
//
    String password = "gfg!@12";
    passwordStrength(password);
  }

  private static void passwordStrength(String password) {
    boolean isLowercase = false;
    boolean isUppercase = false;
    boolean ispecialCharacter = false;
    boolean isDigit = false;
    String specialCharacters = "!@#$%^&*()-+";
    for (Character c : password.toCharArray()) {
      if (Character.isLowerCase(c)) {
        isLowercase = true;
      }
      if (Character.isUpperCase(c)) {
        isUppercase = true;
      }
      if (Character.isDigit(c)) {
        isDigit = true;
      }
      if (specialCharacters.contains(Character.toString(c))) {
        ispecialCharacter = true;
      }
    }
    if (password.length() >= 8 && isUppercase && isDigit && isLowercase && ispecialCharacter) {
      System.out.println("Password is Strong");
    } else if (isUppercase && isLowercase && ispecialCharacter && password.length() >= 6) {
      System.out.println("Password is Moderate");
    } else {
      System.out.println("Password is weak");
    }
  }

}
