package exceptionHandling;

@SuppressWarnings("serial")
public class CarStoppedException extends Exception
{
	public CarStoppedException() 
	{
		
	}
	public CarStoppedException(String s)
	{
		super(s);
	}
}
