/**
 * This class is the Attendant for the pumps
 * @author Greg Flynn
 */

public class Attendant{
  
  private boolean free = true;
  
  /**
   * The constructor just initiates an instance
   */
  public Attendant(){
  }
  
  /**
   * This method returns if the attendant is free
   * 
   * @return Is the attendant free
   */
  public boolean free(){
    return this.free;
  }
  
  /**
   * This method makes the attendant not be free
   */
  public void busy(){
    free = false;
  }
  
  /**
   * This method makes the attendant free
   */
  public void done(){
    free = true;
  }
  
}

