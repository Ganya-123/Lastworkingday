package designPatterns.Factory;

public class FactoryMain {
  public static void main(String[] args) {
    Factory factory=new IceFactory();//what is happening here is logic is getting exposed
    System.out.println(factory.fac());// so use factory pattern
    // in factory we should allow users to create object whichever they want
Factory factory1=GetFactory.getFactory("ice");//equal to Factory factory1=new Factory(); because GetFactory.getFactory("ice") is returning new IceFactory();
    System.out.println(factory1.fac());
    Factory factory2=GetFactory.getFactory("Cloth");
    System.out.println(factory2.fac());
    Factory factory3=GetFactory.getFactory("Tool");
    System.out.println(factory3.fac());
  }
}
