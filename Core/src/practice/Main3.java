package practice;

import java.io.IOException;
import java.lang.Exception;

public class Main3 {
    public static void main(String[] args) {
        try {
            // Create an exception
            Exception arithmetic = new Exception("Exception");

            // First initCause - sets the cause to ArithmeticException
            arithmetic.initCause(new ArithmeticException("Exception"));

            // Second initCause - tries to overwrite the cause (this will trigger IllegalStateException)
            arithmetic.initCause(new IOException("Exception"));  // This should throw IllegalStateException

            // This line will not be reached because IllegalStateException will be thrown
            throw arithmetic;

        } catch (IllegalStateException e) {
            // Catches IllegalStateException thrown when overwriting the cause
            System.out.println("Caught IllegalStateException: " + e.getMessage());  // Print message from IllegalStateException
        } catch (Throwable e) {  // Catch all possible Throwable exceptions
            // Catches any other exceptions (e.g., unchecked exceptions)
            System.out.println("Caught Throwable: " + e.getMessage());
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
