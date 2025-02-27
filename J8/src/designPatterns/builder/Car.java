package designPatterns.builder;

public class Car {
  private String brand;         // Required
  private String model;         // Required
  private String engineType;    // Optional (e.g., Petrol, Diesel, Electric)
  private boolean hasGPS;       // Optional
  private boolean hasSunroof;   // Optional

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public String getEngineType() {
    return engineType;
  }

  public boolean isHasGPS() {
    return hasGPS;
  }

  public boolean isHasSunroof() {
    return hasSunroof;
  }

  private Car(CarBuilder builder) {
    this.brand = builder.brand;
    this.model = builder.model;
    this.engineType = builder.engineType;
    this.hasGPS = builder.hasGPS;
    this.hasSunroof = builder.hasSunroof;
  }

  public static class CarBuilder {
    private String brand;
    private String model;
    private String engineType;
    private boolean hasGPS;
    private boolean hasSunroof;

    public CarBuilder(String brand, String model) {
      this.brand = brand;
      this.model = model;

    }

    public CarBuilder engineType(String engineType) {
      this.engineType = engineType;
      return this;
    }

    public CarBuilder hasGPS(boolean hasGPS) {
      this.hasGPS = hasGPS;
      return this;
    }

    public CarBuilder hasSunroof(boolean hasSunroof) {
      this.hasSunroof = hasSunroof;
      return this;
    }

    public Car build() {
      return new Car(this);

    }
  }
}
