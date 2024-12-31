package exceptionHandling;

public class ChildClass extends ParentClass
{
	@Override
	public void loadingClass(String name)
	{
		if(name.length()==0)
		{
			throw new IllegalArgumentException("Class name cannot be empty");
		}
		super.loadingClass(name);
	}
	public static void main(String[] args)
	{
		ChildClass c=new ChildClass();
		try 
		{
		String s=args[0];
		c.loadingClass(s);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
