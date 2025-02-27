package interviewQuestions;

import java.util.Scanner;

public class DaysAddSub {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String day = sc.next();
    int value = sc.nextInt();
    sc.close();
    System.out.println(findFinalDay(day, value));
  }
    public static DaysOfWeek findFinalDay(String day, int value){
      int result;
      if (value < 0) {
        int a = DaysOfWeek.valueOf(day).dayNum + value;
       if(a<0){
        result = 7 -(- a);}
       else{
         result=a;
       }
        System.out.println("result negative------------------"+result);
      return findDayonId(result);
      }
      else {
        result = (DaysOfWeek.valueOf(day).dayNum + value) % 7;
        System.out.println("result positive------------------"+result);

        return findDayonId(result);

      }
    }

  private static DaysOfWeek findDayonId(int result) {
    for (DaysOfWeek a : DaysOfWeek.values()) {
      if (result==a.dayNum) {
       return  a;

      }
    }
    return null;
  }

  enum DaysOfWeek {

    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);
int dayNum;

    DaysOfWeek(int dayNum) {
      this.dayNum=dayNum;
    }
  }
}
