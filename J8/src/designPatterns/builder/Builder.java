package designPatterns.builder;

public class Builder {
  public static void main(String[] args) {
    Car car = new Car.CarBuilder("Audi", "2025").hasSunroof(true).hasGPS(true).build();
    System.out.println(car.getBrand());
  }
}
