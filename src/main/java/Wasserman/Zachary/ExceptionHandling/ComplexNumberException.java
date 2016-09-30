package Wasserman.Zachary.ExceptionHandling;

/**
 * Created by zacharywasserman on 9/30/16.
 */
public class ComplexNumberException extends Exception{

        public ComplexNumberException(){
            System.err.println("ERROR! Number is complex!");
        }
}
