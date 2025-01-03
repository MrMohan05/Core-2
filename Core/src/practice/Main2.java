package practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.Throwable;
//17.What is the output of the following program
public class Main2
{
      public static void main(String... args)
      {
    	  try {
              // Create an exception
              Exception arithmetic = new Exception("Exception");
              arithmetic.hashCode();
              // First initCause - sets the cause to ArithmeticException
              arithmetic.initCause(new ArithmeticException("Exception"));
              
              // Second initCause - tries to overwrite the cause (this will trigger IllegalStateException)
              arithmetic.initCause(new IOException("Exception"));  // This will throw IllegalStateException

              // This line will not be reached because IllegalStateException will be thrown
              throw arithmetic;

          		}
              catch (IllegalStateException e)
              {
//            	  e.printStackTrace();
                      System.out.println(e.getMessage());
              }
    	  		catch (Throwable e) {  // Catch all possible Throwable exceptions
              // Catches any other exceptions (e.g., unchecked exceptions)
              System.out.println("Caught Throwable: " + e.getMessage());
    	  		}
              try
              {
                      NumberFormatException numberFormat = new NumberFormatException("NumberFormatException");
                     //numberFormat.initCause(new NullPointerException ("NullPointerException"));
                      throw numberFormat;
              }
              catch(NumberFormatException numberFormat)
              {
                      System.out.println(numberFormat);
              }
      }
}
