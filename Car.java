/**
 * This is a class for all cars coming to the petrol station
 * 
 * @author Greg Flynn
 */

public class Car{
  private FuelType fuelType;
  private int waitTime;
  
  /**
   * This constructor makes a car with a certain type of fuel
   * 
   * @param n Type of fuel, 0 for petrol, 1 for Diesel.
   * @throws RuntimeException if an invalid fuel type is specified
   */
  public Car(int n){
    switch(n){
      case 0:
       fuelType = FuelType.Petrol;
        break;
      case 1:
        fuelType = FuelType.Diesel;
        break;
      default:
        throw new RuntimeException("Invalid fuel type");
    }
  }

  /**
   * This returns the type of fuel 
   * 
   * @return the fuel type, either Petrol or Diesel
   */
  public FuelType getFuel(){
    return this.fuelType;
  }
  
  /**
   * This returns the amount of time that the car has been waiting
   *
   * @return the wait time, in minutes 
   */
  public int getWaitTime(){
    return waitTime;
  }
  
  /**
   * This method increases the time that the car has been waiting.
   * This method is called each frame
   * 
   */
  public void incWaitTime(){
    this.waitTime++;
  }
  
  /**
   * This method is a comparison of two cars to ensure that the
   * fuel is the same.  This is useful for unit testing
   * 
   * @param c The car to compare it to
   * 
   * @return are they equal?
   */
  public boolean equals(Car c){
    return (this.fuelType == c.getFuel());
  }
}