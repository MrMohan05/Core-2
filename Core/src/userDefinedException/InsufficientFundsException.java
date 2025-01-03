package userDefinedException;

@SuppressWarnings("serial")
public class InsufficientFundsException extends Exception
{
	public InsufficientFundsException(String name)
	{
		super(name);
	}
}
