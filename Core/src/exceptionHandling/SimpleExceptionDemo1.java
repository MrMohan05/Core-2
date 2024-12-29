package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try(sc)
		{
			System.out.println("Enter 1st number :");
			int a=sc.nextInt();
			System.out.println("Enter 2nd number :");
			int b=sc.nextInt();
			System.out.println("A :"+a+" B :"+b);
		}
		catch(InputMismatchException e)
		{
			System.out.println("The input is not valid ");
			System.out.println("Message :"+e.getMessage());
			System.out.println("To string :"+e);
			System.out.println("Stack trace :");
			e.printStackTrace();
		}
	}
}
