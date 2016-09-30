package Wasserman.Zachary.ExceptionHandling;

/**
 * Created by zacharywasserman on 9/30/16.
 */
public class DivideByZeroException extends Exception {

    public DivideByZeroException(){
         System.err.println("ERROR! Cannot divide by zero!");
    }

}
