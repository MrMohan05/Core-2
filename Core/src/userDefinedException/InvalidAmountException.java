package userDefinedException;

@SuppressWarnings("serial")
public class InvalidAmountException extends RuntimeException
{
	public InvalidAmountException(String name) 
	{
		super(name);
	}
}
