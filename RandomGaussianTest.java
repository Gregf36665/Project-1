import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class RandomGaussianTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testNon0() {
    RandomGaussian r = new RandomGaussian(0,1);
    assert(r.next()>0);
  }
  
  public void testMean() {
    RandomGaussian r = new RandomGaussian(1,0);
    assert(r.next()==1);
  }
  
  
}
