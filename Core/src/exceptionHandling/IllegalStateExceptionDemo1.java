package exceptionHandling;

public class IllegalStateExceptionDemo1
{
	public static void main(String[] args) 
	{
		try
		{
			throwIllegalException();
		}
		catch(IllegalStateException i)
		{ 
			System.out.println("In main method");
			System.out.println("caught:" +i);
		}
	}
	public static void throwIllegalException() throws IllegalStateException
	{
		try
		{
		throw new IllegalStateException("MyException"); 
		}
		catch(IllegalStateException i)
		{
			System.out.println("inside throw Illegal Exception method");
			System.out.println("Caught :"+i);
		}
	}
}
