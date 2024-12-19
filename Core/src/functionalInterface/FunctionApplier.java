package functionalInterface;

import java.util.function.Function;

public class FunctionApplier 
{
	public static void main(String[] args) 
	{
		Function<String,Integer> f1=(str)->
		{
			return str.length();
		};
		String s="Supekar";
		System.out.println("Length of "+s+" is "+f1.apply(s));
		
		Function<Integer,Double> f2=(n)->
		{
			return n/2.0;
		};
		int n=10;
		System.out.println(n+" After dividing by 2.0 we get "+f2.apply(n));
	}
}


//Ques - 4
//------------
//Design a Java program that utilizes the Function interface within the main method to perform operations on both strings and integers. Implement two functions for string operations: calculating the string length and formatting an integer division result. Your task is to implement these operations inline within the main method using lambda expressions.
//
//FunctionApplier class(ELC):
//
//Requirements:
//Main Method:
//
//Define two lambda expressions by using Function<-,->:
//getStringLength: Computes and returns the length of the input string.
//divideAndFormat: Takes an integer input, divides it by 2.0, and returns the formatted result as a double.
//
//Print the results by calling the functions.
//
//Test Case 1:
//
//Input:
//String testString = "Hello";
//int testInteger = 10;
//Output:
//String length of "Hello": 5
//Result of dividing 10 by 2: 5.0
//
//Test Case 2:
//Input:
//String testString = "Java Programming";
//int testInteger = 15;
//Output:
//String length of "Java Programming": 17
//Result of dividing 15 by 2: 7.5
//
//Test Case 3:
//
//Input:
//String testString = "";
//int testInteger = 8;
//
//Output:
//String length of "": 0
//Result of dividing 8 by 2: 4.0