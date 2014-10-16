/**
 * This class runs the test
 * @author Greg Flyn
 */
public class ExperimentController{
  
  /**
   * The constructor makes an instance of the class
   */
  public ExperimentController(){
  }
  
  
  /**
   * This method takes in 3 parameters and creates a new fuel station based off of that
   * 
   * @param pumpCount the amount of pumps
   * @param attendantCount the amount of attendants
   * @param duration the amount of min for the sim
   * 
   */
  public void run(int pumpCount, int attendantCount, int duration){
    Station s = new Station();
    s.run(pumpCount,attendantCount,duration);
  }
  
  public static void main(String[] args){
    ExperimentController e = new ExperimentController();
    try{
      int pumps = Integer.parseInt(args[0]);
      int attendantCount = Integer.parseInt(args[1]);
      int duration = Integer.parseInt(args[2]);
      e.run(pumps,attendantCount,duration);
    }
    catch (java.lang.ArrayIndexOutOfBoundsException error){
      System.err.println("Command takes 3 arguments: pumps, attendants, duration (minutes)");
      System.exit(-1);
    }

  }
  
  
  
}
