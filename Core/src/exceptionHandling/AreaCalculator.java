package exceptionHandling;

import java.util.Scanner;

public class AreaCalculator 
{
	public static double calculateArea(double l,double w)throws IllegalArgumentException
	{
		if(l<0 || w<0)
		{
			throw new IllegalArgumentException();
		}
		return l*w;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length :");
		double d1=sc.nextDouble();
		System.out.println("Enter width :");
		double d2=sc.nextDouble();
		try(sc)
		{
			System.out.println("Area :"+calculateArea(d1,d2));
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Non negative value is not allowed length :"+d1+" Width :"+d2);
		}
	}
}
