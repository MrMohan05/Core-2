package exceptionHandling;

public class ClassCastExceptionDemo 
{
	public static void handleClassCastException() throws ClassCastException
	{
		Object []o= {"Hello", 123, "Java"};
		for(Object a:o)
		{
			String s=(String) a;
			System.out.println(s);
		}
	}
	public static void main(String[] args) 
	{
		try
		{
		handleClassCastException();
		}
		catch(ClassCastException e)
		{
			e.printStackTrace();
		}
	}
}
