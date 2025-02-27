package designPatterns.Factory;

public  class GetFactory {
  public static Factory getFactory(String factory){
    if(factory== null){
      return null;
    } else if (factory.equalsIgnoreCase("Tool")) {
      return new ToolFactory();
    }
    else if (factory.equalsIgnoreCase("Ice")) {
      return new IceFactory();
    }
    else if (factory.equalsIgnoreCase("Cloth")) {
      return new ClothFactory();
    }
    return null;
  }
}
