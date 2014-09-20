import java.util.ArrayList;

/**
 * This class is the petrol station
 * In here pumps and attendants are made
 * as well as the queue for the pumps
 * 
 * @author Greg Flynn
 */

public class Station{
  
  private Line l = new Line();
  private ArrayList<Pump> pumps;
  private ArrayList<Attendant> attendants;
  private double timeTillNextPetrol=0;
  private double timeTillNextDiesel=0;
  private int carCount = 1;
  public static void main(String[] args){
    
  }
  
  /**
   * This method creates the pumps for the station
   * 
   * @param n number of pumps
   */
  public void makePumps(int n){
    pumps = new ArrayList<Pump>(n);
    for (int i=0;i<n;i++){
      pumps.add(new Pump());
    }
  
  }
  
  /**
   * This method creates the attendants for the station
   * 
   * @param n number of attendants
   */
  public void makeAttendants(int n){
    attendants = new ArrayList<Attendant>(n);
    for (int i=0;i<n;i++){
      attendants.add(new Attendant());
    }
  }
  
  
  /**
   * This is the main testing method
   */
  public void run(int pumpCount, int attendantCount, int duration){
    makePumps(pumpCount);   
    makeAttendants(attendantCount);
    for (int i=0;i<duration;i++){
      carQueue();
      
      while(freePump()&&l.hasNext()&&freeAttendant()){
        tryToFill();        
      }
     // debug();
      nextFrame();
    }
  }
  
  /**
   * This method tries to give the next car a place
   * to fill up
   * 
   * @return was the car sent anywhere
   */  
  public void tryToFill(){
    if (!l.hasNext()) return; // if there is no line
    
    for(int i=0;i<pumps.size();i++){
      if (pumps.get(i).free()&&freeAttendant()){
        Car c = l.next();
        pumps.get(i).fill(c);
        pumps.get(i).askAttendant(attendants);
        System.out.println(carCount+","+c.getWaitTime());
        carCount ++;
        return;
      }
      
    }
    return;
  }
  
  /**
   * This method decides if a new car should be added
   * It works by seeing if the time left is more or less
   * than 0.  If it is it adds a random gaussian number
   * to it.
   */
  public void carQueue(){
    if (timeTillNextPetrol <=0){
      l.add(new Car(0));
      RandomGaussian r = new RandomGaussian(1.5,0.5);
      timeTillNextPetrol += r.next();
    }
    if (timeTillNextDiesel <=0){
      l.add(new Car(1));
      RandomGaussian r = new RandomGaussian(7,5);
      timeTillNextDiesel += r.next();
    }
  }
  

  
  /**
   * This method goes to the next minute in the simulation.
   * It increase the time for the queue.
   * It drains some fuel out of the pump.
   * It decreaces the time till next car.
   */
  public void nextFrame(){
    l.incWaitTime();
    timeTillNextPetrol --;
    timeTillNextDiesel --;
    for(int i=0;i<pumps.size();i++){
      pumps.get(i).incTime();
    }
    for(int i=0;i<attendants.size();i++){
      attendants.get(i).done();
    }    
  }    
  
  /**
   * This method checks if there is any free attendants
   * 
   * @return is there someone free
   */
  public boolean freeAttendant(){
    for (int i=0;i<attendants.size();i++){
      if (attendants.get(i).free()) return true;
    }
  return false;
  }
  
  /**
   * This method checks if there is a pump free
   * 
   * @return is there a pump free
   */
  public boolean freePump(){
    for (int i=0;i<pumps.size();i++){
      if (pumps.get(i).free()) return true;
    }
  return false;
  }
}