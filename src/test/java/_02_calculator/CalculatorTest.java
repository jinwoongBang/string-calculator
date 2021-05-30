package _02_calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

  @Test
  public void add() {
    Calculator cal = new Calculator();
    assertEquals(9, cal.add(6, 3));
  }
}
