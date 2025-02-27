package designPatterns.Singleton;

public class LazySingleton {
  private LazySingleton() {
  }

  private static LazySingleton singletonInstance;

  public static synchronized LazySingleton getInstance() {
    if (singletonInstance == null) {
      return singletonInstance = new LazySingleton();
    } else {
      return singletonInstance;
    }
  }
}
