package designPatterns.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonBreakMain {
  public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    SingletonBreak s1 = SingletonBreak.getInstance();
    SingletonBreak s2 = SingletonBreak.getInstance();
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    Constructor<SingletonBreak> constructor = SingletonBreak.class.getDeclaredConstructor();
    constructor.setAccessible(true); // Bypass private constructor
    SingletonBreak instance2 = constructor.newInstance();
    System.out.println(instance2.hashCode());
  }
}
