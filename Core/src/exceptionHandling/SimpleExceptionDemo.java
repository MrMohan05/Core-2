package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try {
//		System.out.println("Enter 1st number :");
		int a=0;
//		System.out.println("Enter 2nd number :");
		int b=0;
		if(sc.hasNextInt(a=sc.nextInt())||(sc.hasNextInt(b=sc.nextInt())))
		{
			
			throw new InputMismatchException("Input the Number");
		}
		
		System.out.println("Numbera are a="+a+" b="+b);
//		if((Integer.valueOf(a)==null)&&(Integer.valueOf(b)==null))
//		{
	//	throw new InputMismatchException("Input is not apropriate");
//		}
		}
		catch(InputMismatchException i)
		{
			System.out.println("Input mismatch exception occure");
			System.out.println("message :"+i.getMessage());
			System.out.println("Stirng representation :"+i);
			System.out.println("Satack frame :");
			i.printStackTrace();
		}
		finally
		{
			sc.close();
		}
	}
}
 