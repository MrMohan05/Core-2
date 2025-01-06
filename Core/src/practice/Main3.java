package practice;

import java.io.IOException;
import java.lang.Exception;
import java.util.Objects;

public class Main3 {
    public static void main(String[] args) {
        try {
            // Create an exception
            Exception arithmetic = new ArithmeticException("Exception");

            // First initCause - sets the cause to ArithmeticException
            //arithmetic.initCause(new ArithmeticException("Exception"));

            // Second initCause - tries to overwrite the cause (this will trigger IllegalStateException)
            arithmetic.initCause(new NullPointerException("fghjkjb"));  // This should throw IllegalStateException
            
            // This line will not be reached because IllegalStateException will be thrown
            throw arithmetic;

        } catch (Exception e) {
            // Catches IllegalStateException thrown when overwriting the cause
            System.out.println(e+" "+ e.getMessage());  // Print message from IllegalStateException
        } 

        try {
            // Create another exception and throw it
            NumberFormatException numberFormat = new NumberFormatException("NumberFormatException");
            throw numberFormat;
        } catch (NumberFormatException numberFormat) {
            // Print the exception
            System.out.println(numberFormat);
        }
    }
	
}
