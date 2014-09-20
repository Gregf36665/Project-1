import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class LineTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testGetNextEmptyList() {
    Line l = new Line();
    l.next();
    assert(true);
  }
  
  public void testGetNext(){
    Line l = new Line();
    Car c = new Car(0);
    l.add(c);
    c = new Car(1);
    l.add(c);
    Car petrol = new Car(0);
    Car diesel = new Car(1);
    assert(l.next().equals(petrol));
    assert(l.next().equals(diesel));
  }
  

}
