package functionalInterface;

import java.util.Random;
import java.util.function.Supplier;

public class RandomValueGenerator
{
	public static void main(String[] args)
	{
		
	
		Supplier<String> s1=() ->
		{
			return "NIT"+(int)((Math.random()*9000)+1000);
		};
		System.out.println(s1.get());
		
		Supplier<Integer> s2=()->
		{
			Random r=new Random();
			return r.nextInt(57,92);
		};
		System.out.println(s2.get());
	}
}


//Ques - 3
//-----------
//Create a Java program that utilizes the Supplier interface to generate random values. Implement two Supplier instances: one for generating a random alphanumeric string in the format "NIT" followed by four random digits, and another for generating a random integer within a specified range.
//
//RandomValueGenerator class(ELC):
//
//Inside the main method, define two consumers:
//String Supplier (stringSupplier):
//Generates a random alphanumeric string in the format "NIT" followed by four random digits.
//Example output: "NIT1234", "NIT5678", etc.
//
//Integer Supplier (integerSupplier):
//Generates a random integer between a specified minimum and maximum value (inclusive).
//Example output: 57, 92, etc.
//
//Tasks to Implement:
//Define the stringSupplier and integerSupplier instances using the Supplier interface and lambda expressions.
//
//Inside the main method, use these suppliers to generate random values and print the results.
//
//Test Cases:
//
//Test Case 1:
//Output:
//Generated random string: NIT1234
//Generated random integer: 57
//
//Test Case 2:
//Output:
//Generated random string: NIT5678
//Generated random integer: 92
//
//Test Case 3:
//
//Output:
//Generated random string: NIT0192
//Generated random integer: 14
//
