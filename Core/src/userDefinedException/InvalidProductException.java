package userDefinedException;

@SuppressWarnings("serial")
public class InvalidProductException extends RuntimeException
{
	public InvalidProductException(String name)
	{
		super(name);
	}
}
