package designPatterns.Singleton;

public class SingletonBreak {
  private static SingletonBreak singletonbrk;

  private SingletonBreak() {

  }

  public static SingletonBreak getInstance() {
    if (singletonbrk == null) {
      singletonbrk = new SingletonBreak();
    }
    return singletonbrk;
  }


}
