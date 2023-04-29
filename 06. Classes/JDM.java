public class JDM extends Car {
  final private String carType = "JDM";

  public JDM(int modelYear, String modelName, String modelManufacturer) {
    super(modelYear, modelName, modelManufacturer);
  }

  public String toString() {
    return "Name: " + modelName + ", Manufacturer: " + modelManufacturer + ", Year: " + modelYear + ", Type: " + carType;
  }

  public void start() {
    System.out.println("This is SUPRA...");
  }
}