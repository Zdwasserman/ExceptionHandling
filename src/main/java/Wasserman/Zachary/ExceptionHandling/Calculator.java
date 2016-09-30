package Wasserman.Zachary.ExceptionHandling;

/**
 * Created by zacharywasserman on 9/30/16.
 */
public class Calculator {

    public Double add(Double num, Double num2) {
        return num + num2;
    }

    public Double subtract(Double num, Double num2) {
        return num - num2;
    }

    public Double multiply(Double num, Double num2) {
        return num * num2;
    }

    public Double divide(Double num, Double num2) throws DivideByZeroException {
        if (num2 == 0) {
            throw new DivideByZeroException();
        }
        return num / num2;
    }
    public Double squareRoot(Double num) throws ComplexNumberException{
        if (Double.isNaN(Math.sqrt(num)) == true) {
            throw new ComplexNumberException();
        }
        return Math.sqrt(num);
    }

}

