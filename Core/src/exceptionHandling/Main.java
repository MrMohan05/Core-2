package exceptionHandling;


import java.util.Scanner;
import java.util.InputMismatchException;

// Custom InputMismatchException class with support for user-defined messages
class CustomInputMismatchException extends InputMismatchException {
    private String message;

    public CustomInputMismatchException(String message) {
        super(); // Call the parent class constructor
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter 1st number:");
            int a = sc.nextInt();
            System.out.println("Enter 2nd number:");
            int b = sc.nextInt();
            System.out.println("Numbers are a = " + a + ", b = " + b);

            // Throwing the custom InputMismatchException
            throw new CustomInputMismatchException("Input is not appropriate");
        } catch (InputMismatchException e) {
            // Handling the exception
            System.out.println("Exception occurred: " + e.getMessage());
            System.out.println("String representation: " + e);
            System.out.println("Stack trace:");
            e.printStackTrace();
        } finally {
            sc.close(); // Ensure the Scanner is closed
        }
    }
}
