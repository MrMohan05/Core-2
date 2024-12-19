package functionalInterface;

import java.util.function.Consumer;

public class ValueModifier
{
	public static void main(String[] args)
	{
		Consumer<String> c1=str->
		{
			System.out.println("String is upper case :"+str.toUpperCase());
		};
		
		Consumer<Integer> c2=a->
		{
			System.out.println("Squre of vale is :"+a*a);
		};
		
		String s="mohan";
		c1.accept(s);
		
		int n=5;
		c2.accept(n);
	}
}



//Create a Java program that demonstrates the usage of the Consumer interface to perform various operations on a given integer and string value. Your task is to define and use consumers to modify and display these values.
//
//ValueModifier class (ELC) :
//
//Instructions:
//Inside the main method, define two consumers:
//
//stringConsumer: Converts the string to uppercase and prints it.
//integerConsumer: Squares the integer value and prints it.
//
//Define a sample string value (e.g., "hello") and an integer value (e.g., 3).
//
//Use each consumer to perform the corresponding operation on the sample values and print the results.
//
//Test Cases:
//Test Case 1:
//
//Input: "world", 5
//Output:
//Original string: world
//Original integer: 5
//After converting string to uppercase: WORLD
//After squaring the integer: 25
//
//Test Case 2:
//Input: "java", 7
//Output:
//Original string: java
//Original integer: 7
//After converting string to uppercase: JAVA
//After squaring the integer: 49
//
//Test Case 3:
//Input: "example", 4
//Output:
//Original string: example
//Original integer: 4
//After converting string to uppercase: EXAMPLE
//After squaring the integer: 16
//
//
