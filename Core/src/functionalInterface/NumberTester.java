package functionalInterface;

import java.util.function.Predicate;

public class NumberTester
{
	public static void main(String[] args)
	{
		Predicate<Integer> p1=a->(a%2)==0;
		Predicate<Integer> p2=a->
		{
			int c=0;
			for(int i=2;i<a;i++)
			{
				if(a==1)
				{
					System.out.println("Neither prime ");
					return false;
				}
				if(a%i==0)
				{
					c++;
				}
			}
			if(c==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		};
		int num=5;
		System.out.println(num+" Is Even :"+p1.test(num));
		System.out.println(num+" Is prime or not :"+p2.test(num));
	}
}

//Ques - 1
//--------------
//package functionalInterface;
//Create a Java program that demonstrates the usage of the Predicate interface to test if a number is even or prime. Your task is to implement a method testPredicate in the NumberTester class that tests a given number against a provided predicate.
//
//NumberTester Class(ELC):
//
//In the main method:
//Define two predicates:
//isEven: Checks if a given number is even.
//isPrime: Checks if a given number is prime.
//
//Define a sample integer number (e.g., 13).
//
//Test each predicate using the testPredicate method and print the result indicating whether the number satisfies each predicate.
//
//Test Cases:
//
//Test Case 1:
//Input: 13
//Output:
//Is 13 even? false
//Is 13 prime? true
//
//Test Case 2:
//Input: 5
//Output:
//Is 5 even? false
//Is 5 prime? true
//
//Test Case 3:
//Input: 20
//Output:
//Is 20 even? true
//Is 20 prime? false
//
//Ques - 2
//-------------
