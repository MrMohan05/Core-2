package exceptionHandling;

public class ArrayStoreExample2 
{
	public static void storeObjects(Object []obj)
	{
		for(Object o:obj)
		{
			if(!(o instanceof String))
			{
				throw new ArrayStoreException("");
			}
		}
	}
	public static void main(String[] args)
	{
		Object []obj= {"Hello","java",123};
		try
		{
			storeObjects(obj);
			System.out.println("No problem all are string");
		}
		catch(ArrayStoreException a)
		{
			System.out.println("Exception occured :"+a);
		}
		
	}
}
