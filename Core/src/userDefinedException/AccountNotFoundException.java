package userDefinedException;

@SuppressWarnings("serial")
public class AccountNotFoundException extends Exception
{
	public AccountNotFoundException (String name)
	{
		super(name);
	}
}
