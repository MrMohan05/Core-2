package exceptionHandling;

public class IllegalStateExceptionDemo
{
	public static void main(String[] args) 	
	{
		throwIllegalException();
	}
	static void throwIllegalException()
	{
		try
		{ 
			throw new IllegalStateException("MyException"); 
		} 
		catch(IllegalStateException objA)
		{
			System.out.println("caught:" +objA); 
		}
	 }
}
