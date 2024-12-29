package exceptionHandling;

import java.util.Scanner;

public class ArrayIndexExceptionDemo1 
{
	public static void main(String[] args)
	{

		int n[]=new int[2];
		Scanner sc=new Scanner(System.in);
		try(sc)
		{
		System.out.println("Enter the element you want to access :");
		int a=sc.nextInt();
		if(a>n.length)
		{
			throw new ArrayIndexOutOfBoundsException("Array size is less");
		}
		}
		catch (ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Mesage :"+a.getMessage());
		}
	}
}
