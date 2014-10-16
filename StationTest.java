import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class StationTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testProfitPetrol() {
    Station s = new Station();
    assert(s.profitEarned(new Car(0))==11);
  }
  
  public void testProfitDiesel() {
    Station s = new Station();
    assert(s.profitEarned(new Car(1))==23);
  }
  
  public void testfreePump() {
    Station s = new Station();
    s.makePumps(1);
    assert(s.freePump());
  }
  
  public void testfreePumpFail() {
    Station s = new Station();
    s.makePumps(1);
    s.makeAttendants(1);
    s.carQueue(); // fill the line
    s.tryToFill();
    assert(!s.freePump());
  }
  
  public void testfreeAttendantFail() {
    Station s = new Station();
    s.makePumps(1);
    s.makeAttendants(1);
    s.carQueue(); // fill the line
    s.tryToFill();
    assert(!s.freeAttendant());
  }
  
  public void testfreeAttendant() {
    Station s = new Station();
    s.makePumps(1);
    s.makeAttendants(1);
    assert(s.freeAttendant());
  }
}
