package exceptionHandling;

import java.util.Scanner;

public class FinancialTransaction 
{
	public static void processTransaction(double d,long l)
	{
		if(d<=0 || l<=0)
		{
			throw new IllegalArgumentException();
		}	
		System.out.println("Amount :"+d+" Transferd to account :"+l);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try(sc)
		{
			double d=sc.nextDouble();
			long l=sc.nextLong();
			processTransaction(d, l);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid number");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Number must  greater than 0");
		}
		catch(RuntimeException e)
		{
			System.out.println("Runtime exception occured");
			e.printStackTrace();
		}
	}
}
