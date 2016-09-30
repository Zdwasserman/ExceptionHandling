package ExceptionHandlingTest;

import org.junit.Test;
import Wasserman.Zachary.ExceptionHandling.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by zacharywasserman on 9/30/16.
 */
public class CalculatorTest {
    @Test
    public void addTest(){
        Calculator calc = new Calculator();
        Double actual = calc.add(3.0,5.0);
        Double expected = 3.0 + 5.0;
        assertEquals(expected, actual);
    }
    @Test
    public void subtractTest(){
        Calculator calc = new Calculator();
        Double actual = calc.subtract(3.0,5.0);
        Double expected = 3.0 - 5.0;
        assertEquals(expected, actual);
    }
    @Test
    public void multiplyTest() {
        Calculator calc = new Calculator();
        Double actual = calc.multiply(3.0, 5.0);
        Double expected = 3.0 * 5.0;
        assertEquals(expected, actual);
    }
    @Test
    public void divideTest() {
        Calculator calc = new Calculator();
        Double actual = calc.divide(3.0, 5.0);
        Double expected = 3.0 / 5.0;
        assertEquals(expected, actual);
    }


}
