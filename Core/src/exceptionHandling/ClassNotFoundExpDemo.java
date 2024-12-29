package exceptionHandling;

public class ClassNotFoundExpDemo 
{
	public ClassNotFoundExpDemo()
	{
		Class c;
		try
		{
			c=Class.forName("exceptionHandling.test");
			System.out.println("Class found");
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("Class not found");
			System.out.println("Message :"+e.getMessage());
		}
	}
	public static void main(String[] args)
	{
		ClassNotFoundExpDemo c=new ClassNotFoundExpDemo();
	}
}
