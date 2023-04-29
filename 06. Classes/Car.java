public abstract class Car {
  protected int modelYear;
  protected String modelName, modelManufacturer;
  /**
   * abstract method can't have a body and must be implemented in children function
   */
  public abstract void start();

  public Car(int modelYear, String modelName, String modelManufacturer) {
    this.modelYear = modelYear;
    this.modelName = modelName;
    this.modelManufacturer = modelManufacturer;
  }
}