import java.util.LinkedList;


/** 
 * This class forms a line for the cars to wait to go
 * 
 */
public class Line{    
    private LinkedList<Car> queue;
    
    /**
     * The constructor just initiates a list that
     * accepts Cars as an object
     */
    public Line(){
      queue = new LinkedList<Car>();
    }
    
    /**
     * This method accepts a car and adds it to the end of the queue.
     * 
     * @param c The car to add to the queue.
     */
    public void add(Car c){
      queue.add(c);
    }
    
    
    /**
     * This method shows the size of the queue
     * 
     * @return the size of the queue
     */
    public int size(){
      return queue.size();
    }
    
    /**
     * This method checks to see if there is anyone left in line
     * 
     * @return is there anyone in line
     */
    public boolean hasNext(){
      return (queue.size()!=0);
    }
    
    /**
     * This method gets the next car in the queue and removes it.
     * If there is no car in the queue the method returns null
     * 
     * @return the car
     */
    public Car next(){
      try{
      return queue.remove(0);
      }
      catch(java.lang.IndexOutOfBoundsException e){
      }
      return null;
    }
    
    /**
     * This method returns the car at a position in the queue.
     * This is useful for debugging
     * 
     * @param n the index to look at
     * 
     * @return the car
     */
    public Car get(int n){
      return queue.get(n);
    }
    
    /**
     * This method increaces the time for all the cars waiting
     */
    public void incWaitTime(){
      for (int i=0;i<queue.size();i++){
        queue.get(i).incWaitTime();
      }
    }
    
}
  
