import java.util.Random;

/**
 * This class is to create a random number
 * within a gaussian distribution
 * 
 * @author Greg Flynn
 */

public class RandomGaussian{
  private double mean;
  private double variance;
  private Random rand = new Random(System.nanoTime()); // this ensures a new seed each run
  
  /**
   * The constructor sets the mean and variance
   * 
   * @param mean The mean of the return values
   * @param variance The standard deviation of the mean
   */
  public RandomGaussian(double mean, double variance){
    this.mean = mean;
    this.variance = variance;
  }
  
  /**
   * This method returns the next number according to the dirtibution
   * This method ensures that only numbers larger than 0 are returned
   * @return the next number
   */
  public double next(){
    double output = 0;
    do{
      output = mean + (rand.nextGaussian() * variance);
    }
    while(output<0);
    return output;
  }
    
  
}