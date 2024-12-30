package exceptionHandling;

import java.util.Scanner;

public class ClassNotFoundExpDemo2 
{
	ClassNotFoundExpDemo2(String s)
	{
		Class<?> name;
		try
		{
			name=Class.forName(s);
			System.out.println("Class loaded\nName of the class :"+name);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class not found :");
			e.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name of the class :");
		String s=sc.next();
		new ClassNotFoundExpDemo2(s);
		sc.close();
	}
}
