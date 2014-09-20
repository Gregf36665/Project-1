import java.util.ArrayList;
/**
 * This is a class for the pumps
 * 
 * @author Greg Flynn
 */

public class Pump{
  
  private final int dieselFuelTime = 13;
  private final int petrolFuelTime = 3;
  private int timeToGo = 0;
  
  private boolean free = true;
  private boolean petrol;
  
  /**
   * The constructor just initiates it
   */
  public Pump(){
  }
  
  /**
   * This method tries to fill the car up
   * This sets the pump to busy and then sets
   * the time left to either diesel or petrol
   * fuel times
   * 
   * @param c the car to be filled
   */
  public void fill(Car c){

    free = false;
    nextCar(c);
    if(petrol) timeToGo = petrolFuelTime;
    else timeToGo = dieselFuelTime;
  }
  
  private void nextCar(Car c){
    if (c.getFuel()==(new Car(0)).getFuel()) petrol = true;
    else petrol = false;
  }
  
  /**
   * This method adjusts the time to wait
   */
  public void incTime(){
    timeToGo--;
    if(timeToGo <= 0){
      free = true; 
      timeToGo =0;
      
    }
  }
 

  /**
   * This method asks for an attendant to pump the gas
   */
  public void askAttendant(ArrayList<Attendant> aList){
    if (!free){
      for (int i=0;i<aList.size();i++){
        if (aList.get(i).free()){
          aList.get(i).busy();
        }
      }
    }
  }
  
  /**
   * This method says if the pump is free
   * 
   * @return if a car can come in
   */
  public boolean free(){
    return free;
  }
  
}