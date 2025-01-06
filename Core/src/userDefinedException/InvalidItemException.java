package userDefinedException;

@SuppressWarnings("serial")
public class InvalidItemException extends Exception
{
	public InvalidItemException(String name) 
	{
		super(name);
	}
}
