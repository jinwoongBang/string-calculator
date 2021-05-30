package _02_calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

  private Calculator cal;

  /**
   * @Before 을 사용하는 이유는
   *  그냥 new () 객체 생성 방법으로 써도되는데 {@RunWith}, {@Rule} 과 같은 어노테이션을 사용해 기능을 확장 할 수 있다.
   */
  @Before
  public void setup() {
    cal = new Calculator();
    System.out.println("before");
  }

  @Test
  public void add() {
    assertEquals(9, cal.add(6, 3));
    System.out.println("add");
  }

  @Test
  public void subtract() {
    assertEquals(3, cal.subtract(6, 3));
    System.out.println("subtract");
  }

  @After
  public void teardown() {
    System.out.println("teardown");
  }
}
