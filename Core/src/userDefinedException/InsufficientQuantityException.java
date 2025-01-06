package userDefinedException;

@SuppressWarnings("serial")
public class InsufficientQuantityException extends Exception
{
	public InsufficientQuantityException(String name)
	{
		super(name);
	}
}
