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
    public void divideTest() throws Exception {
        Calculator calc = new Calculator();
        Double actual = calc.divide(3.0, 5.0);
        Double expected = 3.0 / 5.0;
        assertEquals(expected, actual);
    }
    @Test(expected = DivideByZeroException.class)
    public void divideExceptionTest() throws DivideByZeroException {
        Calculator calc = new Calculator();
        Double actual = calc.divide(3.0, 0.0);
        Double expected = null;
        assertEquals(expected, actual);

    }
    @Test
    public void squareRootTest() throws ComplexNumberException {
        Calculator calc = new Calculator();
        Double actual = calc.squareRoot(9.0);
        Double expected = Math.sqrt(9.0);
        assertEquals(expected, actual);
    }
    @Test(expected = ComplexNumberException.class)
    public void ComplexNumberExceptionTest() throws ComplexNumberException {
        Calculator calc = new Calculator();
        Double actual = calc.squareRoot(-16.0);
        Double expected = null;
        assertEquals(expected, actual);
    }


}
