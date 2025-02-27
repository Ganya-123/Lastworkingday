package designPatterns.Singleton;

import java.util.Arrays;

public class SingleMain {
  public static void main(String[] args) {
    LazySingleton singlton = LazySingleton.getInstance();
    LazySingleton singlton1 = LazySingleton.getInstance();
    System.out.println(singlton1.hashCode());
    System.out.println(singlton.hashCode());
    // Singleton singleton=new Singleton();//private
    Arrays.asList();
  }
}
