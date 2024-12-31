package exceptionHandling;

public class ParentClass 
{
	public void loadingClass(String name)
	{
		try
		{
			Class.forName(name);
			System.out.println("Class loaded");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class not found ");
		}
	}
}
